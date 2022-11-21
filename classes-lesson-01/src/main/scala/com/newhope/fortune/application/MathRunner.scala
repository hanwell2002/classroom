package com.newhope.fortune.application

import com.newhope.fortune.classes.MathCompanion

object MathRunner {

  def main(args: Array[String]): Unit = {

    val mathMaxValue = MathCompanion.getPrivateMember;

    println(mathMaxValue)

    println(MathCompanion.sum(10, 90))

  }
}