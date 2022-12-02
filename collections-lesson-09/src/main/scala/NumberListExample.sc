val numbers = List(1,2,3,4,5,6,7,8, 9, 10)

numbers.sum
numbers.product
numbers.min
numbers.max

val gt5 = numbers.filter(v => v > 5)
val gt6 = numbers.filter( _ >= 5).min
//get max


