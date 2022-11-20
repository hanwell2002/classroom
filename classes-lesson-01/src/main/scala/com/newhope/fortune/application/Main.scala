package com.newhope.fortune.application

/*
import com.newhope.fortune.entity.Employee
import com.newhope.fortune.entity.Manager
*/
import com.newhope.fortune.entity._
//

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    var emp1 =  new Employee
    var empScott =  new Employee

    emp1.setEmp(10001, "James", 48, 1234.60f)

    empScott.setEmp(10002, "Alice", 24, 2345.12f)

    emp1.printPerson()
    println("------------")


    empScott.printEmp();


    val mary = new ManagerCompanion

    mary.salary = 120
    println("------------")
    println("Manry's salary--->" + mary.salary)


  }
}


