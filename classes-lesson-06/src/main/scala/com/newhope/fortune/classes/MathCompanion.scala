package com.newhope.fortune.classes


object MathCompanion{
  def sum(a: Int, b: Int): Int = a + b
  def getPrivateMember: Int = new MathCompanion().max

}

class MathCompanion {
   val max = 2147483647
}

