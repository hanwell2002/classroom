package lists

/*
 The Scala List is an immutable sequence of elements, implemented as a linked list. Unlike an array, a linked list consists of many small objects, each containing a reference to an object as well as a reference to the rest of the list.
 Lists support efficient addition of new elements at the front.
* */
object ListExample extends App {

  //create list with elements
  val lst1 = List(15, 18, 99, 55)
  val lst2 = List("Scala", "is", "really", "fun")

  // create an empty list and add elements later:
  var alist = List[String]()
  alist == Nil //return true

  // add element to alist
  alist = "apply" :: " banana" :: "grap" :: Nil
  alist.foreach(println(_))

  val blist = 15 :: 18 :: 99 :: 55 :: Nil
  for (item <- blist) println(item)

  //加入一个元素
  val addone = blist :+ 5

  for (item <- addone)
    println(item)

  val addToHead = 0 +: blist
  for (item <- addToHead)
    println(item)


}