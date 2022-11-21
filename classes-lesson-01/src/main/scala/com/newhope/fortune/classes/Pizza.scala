package com.newhope.fortune.classes

class Pizza {
  def printProctName() = {
    println(Pizza.alias)
  }
}

object Pizza {

  private val alias  = "PizzaHut"
  def provideProduct(): Unit = {
    alias
   // new Pizza().printProctName()
  }
}