object SetCompute extends App {

  var trumpHobbies = Set("Election", "Business", "Speach", "Tradewar", "C")
  var biddonHobbies = Set("A", "Politics", "C", "D", "E", "Tradewar")

  var setIntersection = trumpHobbies.intersect(biddonHobbies)
  var sameResult = trumpHobbies & biddonHobbies
  println(">> Using intersect function: " + setIntersection)
  println(">> Using & operator: " + sameResult)

  var setUnion = trumpHobbies.union(biddonHobbies)
  println(setUnion)
}
