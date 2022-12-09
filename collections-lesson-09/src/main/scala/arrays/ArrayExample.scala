package arrays

object ArrayExample extends App{
  val intValueArr = Array(12, 45, 33)
  val myStrArr = Array("BigData", "Hadoop", "Spark")

  println(intValueArr(1))
  println(myStrArr(0))
  assert(myStrArr(2) == "Spark")

  val lst = List(12, 45, 33)

  assert(lst(1) == 45)

}
