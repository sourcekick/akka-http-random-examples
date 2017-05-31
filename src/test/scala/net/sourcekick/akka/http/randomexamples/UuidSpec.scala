package net.sourcekick.akka.http.randomexamples

import org.scalatest.{Matchers, WordSpec}

class UuidSpec extends WordSpec with Matchers {

  private val uuidRegex = "^[0-9a-f]{30}$".r

  "A Uuid" must {
    "have 30 digits" in {
      assert(Uuid.generate().length == 30)
    }

    "always be different" in {
      assert(Uuid.generate() != Uuid.generate())
    }

    "contain only digits or the letters from a to f" in {
      assert(uuidRegex.pattern.matcher(Uuid.generate()).matches)
    }
  }
}
