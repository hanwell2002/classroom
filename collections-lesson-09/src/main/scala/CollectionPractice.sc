import scala.collection.SortedSet

var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)
numbers.foreach((element:Int)=> println(element))

var sum = 0
numbers.foreach(sum += _)
println(sum)


var numbers2: SortedSet[String] = SortedSet("tom", "Brandon", "apple", "Apple")
numbers2.foreach((element:String)=> println(element))
val blist = 15 :: 18 :: 99 :: 55 :: Nil
for (item <- blist) println(item)

