package net.sourcekick.akka.http.randomexamples

import akka.actor.{ActorSystem, Props}
import net.sourcekick.akka.http.randomexamples.car.CarApi
import net.sourcekick.akka.http.randomexamples.conf.AkkaHttpRandomExamplesConf

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object RandomExamplesApp {

  def main(args: Array[String]): Unit = {
    println("Starting akka-http-random-examples application.")
    implicit val system = ActorSystem(AkkaHttpRandomExamplesConf.actorSystemName)
    //Cluster(system).registerOnMemberUp(system.actorOf(Props(new Root), "root"))

    val root = system.actorOf(Props(new CarApi))
    Await.ready(system.whenTerminated, Duration.Inf)
  }

}
