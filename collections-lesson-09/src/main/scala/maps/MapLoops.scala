package maps

object MapLoops extends App{
  val fruits = Map("spring" -> "Cherry", "summer" -> "apricot", "fall" -> "Grape")

  for ((k,v) <- fruits) println(s"key: $k, value: $v")

}
