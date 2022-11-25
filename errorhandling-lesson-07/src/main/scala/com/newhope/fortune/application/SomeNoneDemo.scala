package com.newhope.fortune.application

object SomeNoneDemo extends App {
    //   Some, None, try catch demo
    def toInt(s: String): Option[Int] = {
      try {
        Some(Integer.parseInt(s.trim))
      } catch {
        case e: Exception => None
      }
    }

    x
    // CALL above toInt function defined aboves
    val x: String = "10"
    val result = toInt(x) match {
      case Some(i) => i
      //case None => println("That didn't work.")
      case None => "That didn't work."
    }

    println("result: " + result)
    val stringA: String = "Hello"
    val stringB: String = "9"
    val stringC: String = "65535"


    val y = for {
      a <- toInt(stringA)
      b <- toInt(stringB)
      c <- toInt(stringC)
    } yield b


    println("a: " + y)

    /*
      val valueFromComputation = computeAndGetValueFor(someInput)
      if (valueFromComputation ! = null) {
        // do something with this value
      }
    */

}
