package net.sourcekick.akka.http.randomexamples

import akka.http.scaladsl.model.ErrorInfo
import akka.http.scaladsl.server.Rejection

object Rejections {

  // 400
  final case class BadRequestRejection(info: ErrorInfo) extends Rejection

  // 404
  final case class NotFoundRejection(queryCriteria: Map[String, String]) extends Rejection
  final case class NotFoundByUuidRejection(uuid: String) extends Rejection

  // 422
  final case class UnprocessableEntityRejection(entity: Any) extends Rejection

  // 500
  final case class InternalServerErrorRejection(info: ErrorInfo) extends Rejection

}
