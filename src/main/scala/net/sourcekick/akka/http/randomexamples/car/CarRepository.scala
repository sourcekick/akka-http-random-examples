package net.sourcekick.akka.http.randomexamples.car

import net.sourcekick.akka.http.randomexamples.car.CarModel.Car.CarT
import slick.jdbc.PostgresProfile.api._

private[car] class CarRepository(private val db: Database) {

  private[car] val cars: TableQuery[CarT] = TableQuery[CarT]

}
