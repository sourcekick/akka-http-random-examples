import scala.io.Source

val company = "sourcekick"
name := "akka-http-random-examples"

val versionString: String = Source.fromFile("version").getLines.next
version := versionString

scalaVersion := Version.Scala
crossScalaVersions := Seq(Version.Scala)

parallelExecution in Test := true

libraryDependencies ++= Vector(
  Library.scalaTest % Test,
  Library.h2Database % Test,
  // Akka
  //  Library.constructr,
  //  Library.constructrCoordinationEtcd,
  //  Library.akkaClusterTools,
  Library.akkaTestkit % Test,
  Library.akkaSlf4j,
  Library.akkaStream,
  Library.akkaStreamTestkit % Test,
  Library.akkaHttp,
  Library.akkaHttpTestkit % Test,
  Library.akkaHttpCirce,
  Library.scalaTime,
  // database
  Library.postgresJdbcDriver,
  Library.slick,
  Library.slickHikaricp,
  //  Library.akkaPersistenceCassandra,
  //  Library.akkaPersistenceInmemory % Test,
  //  Library.akkaSse,
  Library.circeCore,
  Library.circeGeneric,
  Library.circeJavaTime,
  Library.circeJawn,
  Library.circeNumbers,
  Library.circeParser,
  Library.jwt,
  // logging
  Library.logbackClassic
)

//initialCommands := """|import de.heikoseeberger.gabbler.user._|""".stripMargin

/******************************************************************************************
                                      Docker
******************************************************************************************/
enablePlugins(JavaAppPackaging)
enablePlugins(AshScriptPlugin)

mappings in Universal += {
  // we are using the reference.conf as default application.conf
  // the user can override settings here
  val conf = (resourceDirectory in Compile).value / "reference.conf"
  conf -> "conf/application.conf"
}

scriptClasspath := Seq("../conf/") ++ scriptClasspath.value

daemonUser.in(Docker) := "root"
maintainer.in(Docker) := "sourcekick"
version.in(Docker) := versionString
dockerBaseImage := "java:8-jre-alpine"
dockerExposedPorts := Vector(8080)
dockerExposedVolumes in Docker := Seq("/config")
dockerRepository := Some("sourcekick")
mappings in Universal += {
  var appjar = (packageBin in Test).value
  appjar -> s"lib/${appjar.getName}"
}
