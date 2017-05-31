package net.sourcekick.akka.http.randomexamples

import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Directives.complete
import akka.http.scaladsl.server.RejectionHandler.Builder
import akka.http.scaladsl.server.{AuthenticationFailedRejection, MalformedQueryParamRejection, RejectionHandler}
import net.sourcekick.akka.http.randomexamples.Rejections._

object RejectionHandlers {

  def builder: Builder = {
    val builder = RejectionHandler
      .newBuilder()
      .handleNotFound {
        // url does not exist
        complete(NotFound, HttpEntity(ContentTypes.`application/json`, s"""{"error": "Unknown url"}"""))
      }
      .handle {
        case MalformedQueryParamRejection(param, errorMsg, _) =>
          complete(UnprocessableEntity,
                   HttpEntity(ContentTypes.`application/json`,
                              s"""{"errors": [{"code": "$errorMsg", "propertyPath": "$param"}]}"""))

      }
      .handle {
        case BadRequestRejection(info) => complete(BadRequest, info.summary)
      }
      .handle {
        case NotFoundRejection(queryCriteria) =>
          complete(NotFound,
                   HttpEntity(ContentTypes.`application/json`,
                              s"""{"error": "Entity not found by criteria $queryCriteria"}"""))
      }
      .handle {
        case AuthenticationFailedRejection(_, _) =>
          complete(Unauthorized,
                   HttpEntity(ContentTypes.`application/json`, s"""{"error": "You are not authenticated."}"""))
      }
      .handle {
        case NotFoundByUuidRejection(uuid) =>
          complete(NotFound,
                   HttpEntity(ContentTypes.`application/json`, s"""{"error": "Entity with uuid $uuid not found"}"""))
      }
      .handle {
        case UnprocessableEntityRejection(entity) => complete(UnprocessableEntity)

      }
      .handle {
        case InternalServerErrorRejection(info) => complete(InternalServerError, info.summary)
      }
    builder
  }

}
