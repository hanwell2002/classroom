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

// do same by _
val locations = events.map(_.location)