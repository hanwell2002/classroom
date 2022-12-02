val numbers = List(9,4,3,7)

//get 1st element
numbers.head

//get rest of the element
val second = numbers.tail

second.head
val tail2 = second.tail

val thirdPos = tail2.head

//get last element
numbers.last
//all other element except last one
numbers.init


//add elmt
numbers :+ 5
//add elmt in front
0 +: numbers

//combine 2 lists
numbers ++ List(5,6,7)

List(-1, 0) ++  numbers

numbers.drop(1)
numbers.drop(2)
numbers.dropRight(1)
numbers.dropRight(2)

val lst = List(1,2, 3, 2, 4,5)
lst.dropWhile( _ < 3 )






