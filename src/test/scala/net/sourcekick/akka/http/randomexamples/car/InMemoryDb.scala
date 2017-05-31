package net.sourcekick.akka.http.randomexamples.car

import slick.jdbc.H2Profile.api._
import slick.jdbc.meta.MTable

import scala.concurrent.Await
import scala.concurrent.duration._

object InMemoryDb {

  // when using ParallelTestExecution we need to hold the references to our shared fixture outside of the Spec class
  // because apparently for each test case in the Spec the Spec class is instantiated individually
  // therefore we simply keep these references here in the companion object

  private val carRepositoryInMem = new CarRepository(TestDatabaseConnectionPool.testInMemoryDb)

  // prepare H2
  TestDatabaseConnectionPool.testInMemoryDb.run(
    DBIO.seq(
      carRepositoryInMem.cars.schema.create
    ))

  private val tablesCreated =
    Await.result(TestDatabaseConnectionPool.testInMemoryDb.run(MTable.getTables), 2.seconds).toList
  val tables = tablesCreated

}
