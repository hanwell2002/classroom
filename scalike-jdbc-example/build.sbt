ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scalike-jdbc-example"
  )

// Scala 2.12, 2.13 and 3
libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc"       % "4.0.0",
  // "com.h2database"  %  "h2"                % "1.4.200",
  "org.postgresql"     % "postgresql"      % "42.5.1",
  "ch.qos.logback"  %  "logback-classic"   % "1.2.3"
)
