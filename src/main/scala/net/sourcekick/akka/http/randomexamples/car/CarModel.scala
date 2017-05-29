/**
  * Copyright (C) Recogizer Group GmbH - All Rights Reserved
  * Unauthorized copying of this file, via any medium is strictly prohibited
  * Proprietary and confidential
  * Created on 29.05.17.
  */
package net.sourcekick.akka.http.randomexamples.car

object CarModel {

  final case class Car(carUuid: String,
                       name: String,
                       modelName: String,
                       color: String,
                       numberOfWheels: Int,
                       numberOfDoors: Int)

}
