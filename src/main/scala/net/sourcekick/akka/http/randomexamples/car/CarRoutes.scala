package net.sourcekick.akka.http.randomexamples.car

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpcirce.ErrorAccumulatingCirceSupport._
import io.circe.generic.auto._
import net.sourcekick.akka.http.randomexamples.car.CarModel.Car

import scala.util.matching.Regex

private[car] object CarRoutes {

  val uuidRegexString: String = "^[0-9a-f]{30}$"

  val uuidRegex: Regex = uuidRegexString.r

  private[car] val carRoutes: Route = {
    pathPrefix("api" / "v1" / "cars") {
      pathEnd {
        get {
          complete(Seq(Car("abcdefghijklmnopqrstuvwxyz1234", "Default Car 1", "Standard Car 1", "blue", 4, 5)))
        }
      } ~
      path(uuidRegex) { carUuid =>
        pathEnd {
          get {
            complete(Car(carUuid, "Default Car 2", "Standard Car 2", "red", 4, 3))
          }
        }
      }
    }
  }

}
