package net.sourcekick.akka.http.randomexamples.car

import com.zaxxer.hikari.{HikariConfig, HikariDataSource}
import slick.jdbc.H2Profile.api._

private[car] object TestDatabaseConnectionPool {

  private val url = "jdbc:h2:mem:h2database1;DATABASE_TO_UPPER=false"
  private val postgresDriver = "slick.jdbc.H2Profile"

  private val hconf: HikariConfig = new HikariConfig()
  hconf.setJdbcUrl(url)
  hconf.setMaximumPoolSize(1)
  hconf.setMinimumIdle(1)
  hconf.setAutoCommit(true)
  private val hds: HikariDataSource = new HikariDataSource(hconf)

  lazy val testInMemoryDb: Database =
    Database.forDataSource(hds, Option(1))

}
