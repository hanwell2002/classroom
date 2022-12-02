import scala.collection.SortedSet

object MainObject extends  App {
    var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)
    numbers.foreach((element:Int)=> println(element))

}