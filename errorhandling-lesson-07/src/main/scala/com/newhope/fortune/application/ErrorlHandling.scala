package com.newhope.fortune.application

import scala.util._
import scala.util.Try

object ErrorlHandling extends App {

  val outcome = Try(10 / 0)

  println(outcome.isFailure)
  println(outcome.isSuccess)

  outcome match {
    case Success(value) => println("was ok")
    case Failure(e) => println("failed!" + e.getMessage)
  }

  val employees = Set("John", "Sam", "Mary", "Stacie")

  if (None == employees.find(_ == "Mary")) {
    println("Not fund")

  } else
    println("Found Mary")

  /*


  if (None == employees.find(_ == "Maryna")) println("Not fund")

  if (None == employees.find(_ == "Maryna"))
    println("Not fund")
  else
    println("Found Maryna")

  if (None == employees.find(_ == "Mary"))
   {
     println("Not fund")
   }
  else {
    val personNm = employees.find(_ == "Mary")

    println("Name:" + personNm)
  }

val EMP_NOT_FOUND: String = "EMPLOYEE is not found in the system"
*/

  /*

  add(a > b)

scala> employees.find(_ == "Frank")
res0: Option[String] = None

scala> employees.find(_ == "John")
res1: Option[String] = Some(John)
//            def find(p: (A) ⇒ Boolean): Option[A]
scala > employees.find(_ == "Frank")
res4: Option[String]
= None

scala > employees.find(_ == "Frank").getOrElse("not found employee")
res5: String
= not found employee

scala > employees.find(_ == "Mary").getOrElse("not found employee")
res6: String
= Mary

scala> if(None == employees.find(_== "Maryna")) println ("Not fund")
Not fund

scala> employees.find(_== "Frank")
res1: Option[String] = None
*/


}
