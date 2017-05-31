package net.sourcekick.akka.http.randomexamples

import scala.util.matching.Regex

object Uuid {

  val uuidRegexString: String = "^[0-9a-f]{30}$"

  val uuidRegex: Regex = uuidRegexString.r

  def isValid(uuid: String): Boolean = {
    uuid.matches(uuidRegexString)
  }

  def generate(): String = {
    val idParts = java.util.UUID.randomUUID().toString.split("-")
    idParts(2) = idParts(2).substring(1)
    idParts(3) = idParts(3).substring(1)
    idParts.mkString("")
  }
}
