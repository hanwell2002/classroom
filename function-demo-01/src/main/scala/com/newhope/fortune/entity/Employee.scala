package com.newhope.fortune.entity

class Employee extends Person { // trait
  var empId: Int = 0
  var salary: Float = 0

  def setEmp(empId: Int, name: String, age: Int, sal: Float): Unit = {
    this.empId = empId
    salary = sal

    setPerson(name, 30)
  }

  def printEmp() {
    println("Employee Id:" + empId)
    println("salary: " + salary)
    printPerson();
  }

}
