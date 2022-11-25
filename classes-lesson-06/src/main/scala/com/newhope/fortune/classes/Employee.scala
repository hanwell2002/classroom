package com.newhope.fortune.classes

class Employee {
  private var salary: Int = 700

  def getSalary() = salary
  def setSalary(newSalary: Int) = {
    salary = newSalary
  }
}
