ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "higher-order-function-demo"
  )

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "fansi" % "0.4.0",
  // "com.lihaoyi" %%% "fansi" % "0.4.0" ,
  "org.scala-stm" %% "scala-stm" % "0.9.1"
)