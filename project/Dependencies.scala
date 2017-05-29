import sbt._

// format: off

object Version {
  final val Scala                    = "2.12.0"
  // test
  final val ScalaTest                = "3.0.1"
  final val H2Database               = "1.4.193"
// AKka
  final val Akka                     = "2.5.1"
  final val AkkaHttp                 = "10.0.7"
  final val AkkaHttpCirce            = "1.16.0"
// JSON
  final val Circe                    = "0.8.0"
  // JWT
  final val JwtCirce                 = "0.12.1"
// time
  final val ScalaTime                = "0.4.1"
// database access
  final val PostgresJdbcDriver       = "9.4.1212"
  final val Slick                    = "3.2.0"
// logging
  final val Logback                  = "1.1.7"
}

object Library {
// test
  val scalaTest                  = "org.scalatest"            %% "scalatest"                    % Version.ScalaTest
  val h2Database                 = "com.h2database"           % "h2"                           % Version.H2Database
// AKka
  val akkaTestkit                = "com.typesafe.akka"        %% "akka-testkit"                 % Version.Akka
  val akkaSlf4j                  = "com.typesafe.akka"        %% "akka-slf4j"                   % Version.Akka
  val akkaStream                 = "com.typesafe.akka"        %% "akka-stream"                  % Version.Akka
  val akkaStreamTestkit          = "com.typesafe.akka"        %% "akka-stream-testkit"          % Version.Akka
  val akkaHttp                   = "com.typesafe.akka"        %% "akka-http"                    % Version.AkkaHttp
  val akkaHttpTestkit            = "com.typesafe.akka"        %% "akka-http-testkit"            % Version.AkkaHttp
  val akkaHttpCirce              = "de.heikoseeberger"        %% "akka-http-circe"              % Version.AkkaHttpCirce
// JSON
  val circeCore                  = "io.circe"                 %% "circe-core"                   % Version.Circe
  val circeGeneric               = "io.circe"                 %% "circe-generic"                % Version.Circe
  val circeJavaTime              = "io.circe"                 %% "circe-java8"                  % Version.Circe
  val circeJawn                  = "io.circe"                 %% "circe-jawn"                   % Version.Circe
  val circeNumbers               = "io.circe"                 %% "circe-numbers"                % Version.Circe
  val circeParser                = "io.circe"                 %% "circe-parser"                 % Version.Circe
  // JWT
  val jwt                        = "com.pauldijou"            %% "jwt-circe"                    % Version.JwtCirce
// time
  val scalaTime                  = "codes.reactive"           %% "scala-time"                   % Version.ScalaTime
// database access
  val slick                      = "com.typesafe.slick"       %% "slick"                        % Version.Slick
  val slickHikaricp              = "com.typesafe.slick"       %% "slick-hikaricp"               % Version.Slick
  val postgresJdbcDriver         = "org.postgresql"           % "postgresql"                    % Version.PostgresJdbcDriver
// logging
  val logbackClassic             = "ch.qos.logback"           %  "logback-classic"              % Version.Logback
}
