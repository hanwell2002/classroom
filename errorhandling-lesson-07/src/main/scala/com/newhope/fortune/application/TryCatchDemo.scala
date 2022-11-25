package com.newhope.fortune.application

import scala.util.{Failure, Success, Try}
import scala.util._

object TryCatchDemo extends App {

  def stringtoInt(in: String): Either[String, Int] = {
    try {
      Right(in.toInt)
    } catch {
      case e: NumberFormatException => Left("No Response: " + e.getMessage)
    }
  }

  val fiveToInt = stringtoInt("5")
  println(fiveToInt)

  val helloToInt = stringtoInt("hello")
  println(helloToInt)

 }
