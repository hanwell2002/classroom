package com.newhope.fortune.classes

class Pizza {
  def printFilename() = {
    println(Pizza.HiddenAliasName)
  }
}

object Pizza {
  private val HiddenAliasName  = "/tmp/PizzaHut.bar"
}