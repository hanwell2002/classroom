val numbers = List(1,2,3,4,5,6,7,8, 9, 10)

numbers.sum
numbers.product
numbers.min
numbers.max

val gt5 = numbers.filter(v => v > 5)
val gt6 = numbers.filter( _ >= 5).min
//get max


val pageLoadTimeInSeconds = List(2,1,5,9,14,22,45,2,4,23)
val pageLoadTimeInSeconds2 = List()
pageLoadTimeInSeconds.filter( _ >=10) //predicate element => element >=10

val list = List(4,3,2,1)
list.toSeq

val set2 = Set(4,3,2,1)

val map  = Map((1 -> "Sunday", 2 -> "Monday"))
pageLoadTimeInSeconds2.isEmpty
list.isEmpty
list.nonEmpty
set2.isEmpty
set2.nonEmpty
map.isEmpty; map.nonEmpty

list.toSet

map.toList















