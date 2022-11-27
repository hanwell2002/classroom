package com.newhope.bigdata.application.business

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.sys.process.buildersToProcess

/*
Higher order functions take other functions as parameters or return a function as a result.
This is possible because functions are first-class values in Scala.
The terminology can get a bit confusing at this point, and we use the phrase “higher order function”
for both methods and functions that take functions as parameters or that return a function.
In a pure Object Oriented world a good practice is to avoid exposing methods parameterized with functions
that might leak object’s internal state. Leaking internal state might break the invariants of the object itself thus violating encapsulation.

One of the most common examples is the higher-order function map which is available for collections in Scala.
高阶函数将其他函数作为参数或返回一个函数作为结果。
这是可能的，因为函数是 Scala 中的一等值。
在这一点上，术语可能会有点混乱，我们使用短语“高阶函数”来表示将函数作为参数或返回函数的方法和函数。
在纯面向对象的世界中，一个好的做法是避免公开使用可能泄漏对象内部状态的函数参数化的方法。
泄漏内部状态可能会破坏对象本身的不变量，从而违反封装。

最常见的示例之一是高阶函数映射，它可用于 Scala 中的集合。
 */
object HighOrderFunctionDemo extends App {
  val DIVIDED_LINE = "-----------------------------------------------------"
  val salaries = Seq(20_000, 70_000, 40_000)
  val doubleSalary = (x: Int) => x * 2
  val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)

  println(newSalaries)

  newSalaries.foreach(println)

  println(newSalaries.mkString)
  println(newSalaries.mkString)


  val m = Map(1 -> "a", 2 -> "b", 3 -> "c")
  print(m)
  val marriage1 = Seq("Donald Trump Jr.", "Ivanka", "Eric")
  val marriage1surname = marriage1.map((x: String) => x + " Trump")
  println(marriage1surname)


  val marriage2 = Seq("Tiffany Trump")
  val marriage3 = Seq("Barron Trump")

  var allchildren = List(marriage1surname, marriage2, marriage3)
  println(allchildren)


  println(DIVIDED_LINE)
  val allchildrenFlat = allchildren.flatten

  println("----------before flatten---------")
  println(allchildrenFlat)
  println(DIVIDED_LINE)
  println(allchildrenFlat.map("\"" + _ + "\""))
  println(DIVIDED_LINE)
  println(allchildren.flatMap(_.find(_ == "Ivanka Trump")))

  val fruits = Seq("apple", "orange", "kiwi")
  println(fruits.map(_.toUpperCase))
  println(fruits.flatMap(_.toUpperCase))

  val donaldFamily = Seq("Donald Trump Jr. Trump", "Ivanka Trump", "Eric Trump", "Tiffany Trump", "Barron Trump")
  println(donaldFamily.flatMap(_.toUpperCase))

}
