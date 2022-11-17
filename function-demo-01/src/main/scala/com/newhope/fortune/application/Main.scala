package com.newhope.fortune.application

import com.newhope.fortune.entity.Employee

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    var emp1 =  new Employee
    var emp2 =  new Employee

    emp1.setEmp(10001, "James", 48, 1234.60f)

    emp2.setEmp(10002, "Alice", 24, 2345.12f)

    emp1.printPerson()
    println("------------")


    emp2.printEmp();
  }
}