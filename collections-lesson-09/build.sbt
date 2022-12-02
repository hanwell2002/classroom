ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "collection-lesson-01"
  )

libraryDependencies ++= Seq(
  "com.github.piotr-kalanski" %% "csv2class" % "0.3.3",
  //"au.com.bytecode" % "opencsv" % "5.7.1"
  "com.github.tototoshi" %% "scala-csv" % "1.3.10"
)