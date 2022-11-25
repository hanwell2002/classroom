package com.newhope.bigdata.application.algoristhm
//App is a Trait

object PatternMatchDemo extends App {

  val number = 9
  val res1 = number match {
    case 0 => "zero"
    case 5 => "five"
    case 9 => "nine"
    case _ => " too earlier"

  }
  printf("match result : " + res1 + "\n")

  println("ddddddddddddddddd")


  printf("new line " + res1)

}
