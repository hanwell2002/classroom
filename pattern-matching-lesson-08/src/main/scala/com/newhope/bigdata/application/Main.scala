package com.newhope.bigdata.application

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")


    val number = 9
    val res1 = number match {
      case 0 => "zero"
      case 5 => "five"
      case 9 => "nine"
      case _ => {
        "nothing match"
      }
    }

    println("Match result : "+ res1)

    number match {
      case 0 => "zero"
      case 5 => "five"
      case 9 => "nine"
      case _ => print("nothing match")
    }


  }
}