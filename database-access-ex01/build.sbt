ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "database-access-ex01"
  )

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % "4.0.0",
  "org.postgresql" % "postgresql" % "42.5.1",
  "ch.qos.logback" % "logback-classic" % "1.4.5" % Test
)
