package com.newhope.bigdata.application.algoristhm

import scala.collection.mutable.ListBuffer
import scala.sys.process.buildersToProcess

object PattenMatchOnList extends  App{

  // Make a list via the companion object factory
  val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
   // Pattern match
  days match {
    case firstDay :: otherDays =>
      println("The first day of the week is: " + firstDay)
    case Nil =>
      println("There don't seem to be any week days.")
  }

  // other ways to make list
    // Make a list element-by-element
  val when = "AM" :: "PM" :: Nil
  var options = "opt1" :: "opt2" :: "opt3" :: Nil
  var opt = "opt4" :: options
  println(opt)

  var opt2 = opt :: "opt5" :: Nil
  println(opt2)

  // Use a ListBuffer when you want a “List” modifiable
  var fruits = new ListBuffer[String]()
  fruits += "Apple"
  fruits += "Orange"
  fruits += "Kivi"

  var fruitList = fruits.toList

  println(fruitList)
}
