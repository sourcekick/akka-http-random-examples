package net.sourcekick.akka.http.randomexamples.car

import akka.http.scaladsl.model.StatusCodes
import io.circe.java8.time.TimeInstances
import net.sourcekick.akka.http.randomexamples.AbstractRouteTest
import net.sourcekick.akka.http.randomexamples.car.CarModel.Car
import de.heikoseeberger.akkahttpcirce.ErrorAccumulatingCirceSupport._
import io.circe.generic.auto._

class CarApiSpec extends AbstractRouteTest with TimeInstances {

  override def beforeAll(): Unit = {
    val something = ""
  }

  private def carsPath(): String =
    "/api/v1/cars"

  private def carPath(carUuid: String): String = {
    val carPath = carsPath()
    carPath + s"/$carUuid"
  }

  // trying to find out why compiler gets exceedingly slow when there are many tests

  "CarRoutes" must {

    "return car" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 1" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 2" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 3" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 4" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 5" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 6" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 7" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 8" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 9" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 10" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 11" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 12" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 13" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 14" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 15" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 16" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 17" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 18" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 19" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 20" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 21" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 22" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 23" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 24" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 25" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 26" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 27" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 28" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 29" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 30" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 31" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 32" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
      }
    }

    "return car 33" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 34" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 35" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 36" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 37" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 38" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 39" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 40" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 41" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 42" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 43" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 44" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 45" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 46" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 47" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 48" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 49" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 50" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 51" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 52" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

    "return car 53" in {
      Get(carsPath()) ~> CarApi.routes ~> check {
        status shouldEqual StatusCodes.OK
        expectJsonUtf8Content()
        val cars: Seq[Car] = entityAs[Seq[Car]]
        cars.size shouldBe 1
      }
    }

  }

}
