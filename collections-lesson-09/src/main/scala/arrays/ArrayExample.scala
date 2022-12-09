package arrays

<<<<<<< HEAD
object ArrayExample extends App{
  val intValueArr = Array(12, 45, 33)
  val myStrArr = Array("BigData", "Hadoop", "Spark")

  println(intValueArr(1))
  println(myStrArr(0))
  assert(myStrArr(2) == "Spark")

  val lst = List(12, 45, 33)

  assert(lst(1) == 45)
=======
object ArrayExample extends App {


  // allocating memory of 1D Array of string.
  val essential = Array("Food", "House", "Car", "Travel")

  println(">> The second element of the array: " + essential(1))

  var arrayname = new Array[String](5)

  arrayname(0) = "Tree"
  arrayname(1) = "Flower"
  arrayname(2) = "Fruit"
  arrayname(3) = "Melon"
  arrayname(4) = "Tree"

  arrayname.foreach(println )


>>>>>>> 769f7b719b42cc512a6adc05ca4a3d4e4b473e90

}
