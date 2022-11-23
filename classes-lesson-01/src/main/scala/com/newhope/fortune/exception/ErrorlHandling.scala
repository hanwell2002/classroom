package com.newhope.fortune.exception
import scala.util._


object ErrorlHandling extends  App{

  val employees = Set("John", "Sam", "Mary", "Stacie")

  if (None == employees.find(_ == "Mary"))
    println("Not fund")
  else
    println("Found Mary")

  if (None == employees.find(_ == "Maryna")) println("Not fund")

  /*
scala> employees.find(_ == "Frank")
res0: Option[String] = None

scala> employees.find(_ == "John")
res1: Option[String] = Some(John)

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
  val outcome = Try(10/0)

  outcome match {
    case Success(value) => println("was ok")
    case Failure(e) => println("failed!" + e.getMessage)
  }


}
