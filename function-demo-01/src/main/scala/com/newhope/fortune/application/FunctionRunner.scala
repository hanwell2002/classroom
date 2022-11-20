package com.newhope.fortune.application

import com.newhope.fortune.functions.FunctionDemo

object FunctionRunner {
  def main(args: Array[String]): Unit = {

    var f = new FunctionDemo
    val r1 = f.plusOneOrZero(100)
    val r2 = f.plusOneOrZero(-10)

    println(r1)
    println(r2)

    //if passing wrong type arguments the error
    // class cannot be compiled
    // val r3 = f.plusOneOrZero("number")

    val p = f.product(2, 3)
    printf("Multiply a * b = %s\n", p)

    val funres = (a : Int, b: Int) => a * b
    var x =  funres(2, 4)

    println(x)
    println( funres(2,3) )

    printf("2*3 = %s", funres(2,3))
  }
}
