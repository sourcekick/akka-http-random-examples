package net.sourcekick.akka.http.randomexamples.conf

import com.typesafe.config.ConfigFactory

object AkkaHttpRandomExamplesConf {

  private val config = ConfigFactory.load()

  // REST API
  val apiPort: Int = config.getInt("akka-http-random-examples.akka-http-random-examples-api.port")
  val apiAddress: String = config.getString("akka-http-random-examples.akka-http-random-examples-api.address")

  val actorSystemName: String = config.getString("base.actor-system-name")

  // PostgreSQL
  private val dbHostname = config.getString("postgres-data-source.properties.hostname")
  private val dbPort = config.getString("postgres-data-source.properties.port")
  private val dbName = config.getString("postgres-data-source.properties.database-name")
  private val dbUserName = config.getString("postgres-data-source.properties.user")
  private val dbUserPassword = config.getString("postgres-data-source.properties.password")

  val dbUrl = s"jdbc:postgresql://$dbHostname:$dbPort/$dbName?user=$dbUserName&password=$dbUserPassword"

}
