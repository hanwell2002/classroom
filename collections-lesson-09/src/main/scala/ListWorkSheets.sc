//加入一个元素
val numbers = List(1,2,3,4);


val addone = numbers :+ 5

val addToHead = 0 +: numbers

val addaAnotherLIst = numbers ++ List(7,8,9)

val dropLeft = numbers.drop(1)   // first element 15 gone, left one

val dropRight = numbers.dropRight(2) // drop 2 from right


val numbers2 = List(1, 4, 5, 3,4, 7,2, 8);
val dropWhile = numbers2.dropWhile( _ < 5)