val setExample = Set(1,2,3,4)  //by default: scala.collection.immutable.Set

setExample.toList
//-------------------Map function =----------------------
case class Event(location: String, dayofWeek: String, sessionTimeINSeconds: Integer, source: String)

val event1 = Event("US", "Sun", 10, "Twitter")
val event2 = Event("China", "Sun", 15, "Wechat")
val event3 = Event("New Zealand", "Sun", 30, "Twitter")
val event4 = Event("US", "Tue", 5, "FaceBook")
val event5 = Event("US", "Thu", 24, "Linkedin")
val event6 = Event("US", "Sat", 10, "FaceBook")

val events = List(event1, event2, event3, event4, event5, event6)

//get all locations
val locations = events.map(event => event.location)
val locations = events.map(event => event.dayofWeek)

// do same by _
val locations = events.map(_.location)

val nestedList = List(List(1,2,3,4), List(4,5,6,7))
nestedList.map(alist => alist.map( _ + 2))

val simpleList = List(1,2,3,4)

simpleList.map(_ + 2)

//: List(1,2,3,4,4,5,6,7)

val abc = nestedList.map(alist => alist.map( _ + 2)).flatten

nestedList.flatMap(alist => alist.map( _ + 2))


// ---------------------------------------------------------
val arguments = List("10", "eight", "5", "four", "3", "20", "one")

def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)

  }catch {
    case e: NumberFormatException  => None
  }

}

val as = arguments.map(toInt(_))
val rs = as.flatten.sum
println("result = " + rs)
println(s"result2 = ${rs}")


arguments.flatMap(toInt(_))
arguments.flatMap(toInt(_)).sum


/*
"4" "2" "1" --> 7

"4" "2" "one" --> 6*/


val s1 = Set(2,3,5,7, 6)
val s2 = Set(3,10,1,5, 6)

s1.intersect(s2)
