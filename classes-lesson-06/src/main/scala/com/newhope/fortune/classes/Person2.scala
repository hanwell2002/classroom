package com.newhope.fortune.classes

object Person22 {
  def apply(firstName: String, lastName: String) = new Person2(firstName, lastName)
}

class Person2(firstName: String, lastName: String) {
  def getName: String = firstName + " " + lastName
}

case class Course(title: String, author: String)