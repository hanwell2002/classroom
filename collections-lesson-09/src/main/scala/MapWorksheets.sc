val weekDays = Map (1 -> "Sunday", 3 -> "Tuesday", 2 ->"Monday")
//tuple

weekDays(1)
weekDays(3)
weekDays + ( 4 -> "Wednesday")

weekDays -1 -3
val lst = List("a","b","c")
lst.foreach(elemt => print(elemt))

weekDays.foreach(entry => println(entry._1))
weekDays.foreach(entry => println(entry._2))

weekDays.foreach(entry => println(s"jieguo: ${entry._1}=> ${entry._2}") )
weekDays.foreach(entry => println("jieguo: " + entry._1
                                    + " : " + entry._2) )
weekDays.foreach(entry => println(s"jieguo: {entry._1}=> ${entry._2}") )

weekDays + ( 4 -> "Wednesday", 5 -> "Thusday")


weekDays ++ Map( 4 -> "Wednesday", 5 -> "Thusday")


