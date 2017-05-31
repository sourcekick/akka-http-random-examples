package net.sourcekick.akka.http.randomexamples.car

import net.sourcekick.akka.http.randomexamples.Uuid
import net.sourcekick.akka.http.randomexamples.car.CarModel.Car

class CarFixture {

  private object Fixture {}

  private[car] class Fixture {

    val inMemoryTables = InMemoryDb.tables

    private def carRepository = {
      new CarRepository(TestDatabaseConnectionPool.testInMemoryDb)
    }

    // ----- cars -----

    private[car] val carUuid1 = Uuid.generate()
    private[car] val carUuid2 = Uuid.generate()
    private[car] val carUuid3 = Uuid.generate()
    private[car] val carUuid4 = Uuid.generate()
    private[car] val carUuid5 = Uuid.generate()
    private[car] val carUuid6 = Uuid.generate()
    private[car] val carUuid7 = Uuid.generate()
    private[car] val carUuid8 = Uuid.generate()
    private[car] val carUuid9 = Uuid.generate()

    private[car] var cars1: scala.collection.mutable.Seq[Car] = scala.collection.mutable.Seq[Car]()
    private[car] var cars2: scala.collection.mutable.Seq[Car] = scala.collection.mutable.Seq[Car]()
    private[car] var cars3: scala.collection.mutable.Seq[Car] = scala.collection.mutable.Seq[Car]()
    private[car] var carsAll: scala.collection.mutable.Seq[Car] =
      scala.collection.mutable.Seq[Car]()

    cars1 = cars1 :+ Car(carUuid1, "car1_1", "Car Model 1", "red", 4, 5)
    cars1 = cars1 :+ Car(carUuid2, "car1_2", "Car Model 1", "red", 4, 5)
    cars1 = cars1 :+ Car(carUuid3, "car1_3", "Car Model 1", "red", 4, 5)

    cars2 = cars2 :+ Car(carUuid1, "car2_1", "Car Model 2", "blue", 4, 4)

    cars3 = cars3 :+ Car(carUuid1, "car3_1", "Car Model 3", "green", 3, 4)

    carsAll = cars1.union(cars2).union(cars3)

  }

}
