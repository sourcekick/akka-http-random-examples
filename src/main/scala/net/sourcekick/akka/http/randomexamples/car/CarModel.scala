package net.sourcekick.akka.http.randomexamples.car

import slick.jdbc.PostgresProfile.api._

object CarModel {

  final case class Car(carUuid: String,
                       name: String,
                       modelName: String,
                       color: String,
                       numberOfWheels: Int,
                       numberOfDoors: Int)

  object Car {

    def createCar(tuple: (String, String, String, String, Int, Int)): Car =
      Car(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6)

    def deconstructCar(car: Car): Option[(String, String, String, String, Int, Int)] =
      Option((car.carUuid, car.name, car.modelName, car.color, car.numberOfWheels, car.numberOfDoors))

    class CarT(tag: Tag) extends Table[Car](tag, "cars") {
      def carUuid = column[String]("uuid", O.PrimaryKey)

      def name = column[String]("name")

      def model = column[String]("model")

      def color = column[String]("color")

      def wheels = column[Int]("wheels")

      def doors = column[Int]("doors")

      def * =
        (carUuid, name, model, color, wheels, doors) <>
          (Car.createCar, Car.deconstructCar)
    }

  }

}
