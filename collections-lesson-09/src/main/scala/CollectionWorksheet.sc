import scala.collection.SortedSet

val v = (1, 3.1415926, "This is Pi")

var pi = v._2
var piDesc = v._3

println(pi)
println(piDesc)


var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)
numbers.foreach((element:Int)=> println(element))

// Sum list
var sum = 0
val x = List(1,2,3,4,5,6,7,8,9,10)
x.foreach(sum += _)
println(sum)

//user for to traverse the List
val names = Vector("Bob", "Tom", "Joe", "Som", "Trump")
for (name <- names) println(name)

//  if clause to the for comprehension to
//  filter the elements we want to print:
for (name <- names if name.equals("Trump"))
   println (name + " is ex President of USA")

for (name <- names if name.startsWith("J"))
  println (name + " is current President of USA")
















































