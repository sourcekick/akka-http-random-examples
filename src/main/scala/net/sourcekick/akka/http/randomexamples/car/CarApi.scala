package net.sourcekick.akka.http.randomexamples.car

import java.net.InetSocketAddress

import akka.actor.Status.Failure
import akka.actor.{Actor, ActorLogging}
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives.{complete, extractRequest, handleExceptions, handleRejections}
import akka.http.scaladsl.server.{ExceptionHandler, Route}
import akka.stream.ActorMaterializer
import net.sourcekick.akka.http.randomexamples.RejectionHandlers
import net.sourcekick.akka.http.randomexamples.conf.AkkaHttpRandomExamplesConf
import org.slf4j.{Logger, LoggerFactory}
import akka.pattern.pipe

object CarApi {

  private val carRejectionHandler = RejectionHandlers.builder.result()

  val logger: Logger = LoggerFactory.getLogger(getClass)

  private[car] val routes: Route = handleRejections(carRejectionHandler) {
    val eh = ExceptionHandler {
      case ex @ (_: Exception) =>
        logger.error("Error occured.", ex)
        complete(StatusCodes.InternalServerError)
    }

    handleExceptions(eh) {
      extractRequest { request =>
        logger.debug("Received request={}", request)
        CarRoutes.carRoutes
      }
    }
  }

}

final class CarApi extends Actor with ActorLogging {
  import context.dispatcher

  private implicit val materializer = ActorMaterializer()
  private implicit val system = context.system

  private val port = AkkaHttpRandomExamplesConf.apiPort
  private val address = AkkaHttpRandomExamplesConf.apiAddress

  Http(system).bindAndHandle(CarApi.routes, address, port).pipeTo(self)

  override def receive: PartialFunction[Any, Unit] = {
    case Http.ServerBinding(serverAddress) => handleBinding(serverAddress)
    case Failure(cause) => handleBindFailure(cause)
  }

  private def handleBinding(address: InetSocketAddress) = {
    log.info(s"CarApi listening on $address")
    context.become(Actor.emptyBehavior)
  }

  private def handleBindFailure(cause: Throwable) = {
    log.error(cause, s"Can't bind to $address:$port!")
    context.stop(self)
  }

}
