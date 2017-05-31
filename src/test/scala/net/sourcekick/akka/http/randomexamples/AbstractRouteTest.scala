package net.sourcekick.akka.http.randomexamples

import akka.http.scaladsl.model.headers.Accept
import akka.http.scaladsl.model.{ContentTypes, HttpCharsets, MediaRange, MediaType}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Assertion, BeforeAndAfterAll, Matchers, WordSpec}

abstract class AbstractRouteTest extends WordSpec with Matchers with BeforeAndAfterAll with ScalatestRouteTest {

  def expectJsonUtf8Content(): Assertion = {
    contentType shouldEqual ContentTypes.`application/json`
    charset shouldEqual HttpCharsets.`UTF-8`
  }

  def expectCsvUtf8Content(): Assertion = {
    contentType shouldEqual ContentTypes.`text/csv(UTF-8)`
    charset shouldEqual HttpCharsets.`UTF-8`
  }

  def acceptHeaderCsv(): Accept = {
    Accept(MediaRange(MediaType.text("csv")))
  }

}
