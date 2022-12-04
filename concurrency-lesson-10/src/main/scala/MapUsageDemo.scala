object MapUsageDemo extends App{

  val numsToStars = {
    var nToS = Map.empty[Int, String]
    for (i <- 0 to 10) nToS += i -> "*" * i
    nToS
  }

  println(numsToStars)

  for ((k,v) <- numsToStars) println(s"key: $k, value: $v")


  // or
  val numsToStars2 = Map.empty ++ (0 to 10).map { i =>
    (i, "*" * i)
  }


  println(numsToStars2)
  // version 1 (tuples)
  numsToStars2 foreach (x => println(x._1 + "-->" + x._2))

  // version 2 (foreach and case)
  numsToStars2 foreach { case (key, value) => println(key + "-->" + value) }

/*
 val p1Ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me and Dupree" -> 3.5
  )

  p1Ratings.keys.foreach((movie) =>
    if (pRatings.contains(movie)) similarItems += (movie -> true)
  )
  */


}
