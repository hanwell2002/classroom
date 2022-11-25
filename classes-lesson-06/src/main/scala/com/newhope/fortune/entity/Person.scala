package com.newhope.fortune.entity

class Person {
  var name: String = ""
  var age: Int = 0

  def setPerson(_name: String, age: Int): Unit =  {
      this.name = _name
      this.age = age
  }

  def printPerson(): Unit = {
    printf("\tName: %s", name)
    printf("\tage: %s", age)

  }

}
