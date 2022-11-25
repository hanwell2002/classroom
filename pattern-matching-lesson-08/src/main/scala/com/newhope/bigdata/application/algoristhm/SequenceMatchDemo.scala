package com.newhope.bigdata.application.algoristhm

class SequenceMatchDemo {

  def demo() : Unit = {
    val numbers = List(10, 20, 30)

   val r =  numbers match {
      case List(a, b, c) => c

      case _ => -1
    }
    println(r)

  }

}

object SequenceMatchDemo {
  def run(): Unit = {
    new SequenceMatchDemo().demo
  }
}


/*
val numbers = List(10, 20, 30)

 numbers match {
  case List( _, b, _) =>  b
  case _=> -1
 }

val numbers2 = List(10, 20, 30, 40, 50, 60 )

numbers2 match {
  case List (_, b, _) => b
  case _ => - 1
}

  numbers2 match {
  case List (_, second, _*) => second
  case _ => - 1
}
* */
