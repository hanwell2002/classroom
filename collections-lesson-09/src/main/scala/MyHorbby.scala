object MyHorbby {
  def main(args: Array[String]): Unit = {
    println("Scala Collections")

    // https://en.wikipedia.org/wiki/List_of_hobbies
    var hobbies = Set("Book", "Music", "Football", "Hikking", "Diving")
    println("-------------way 1 --------------------")
    hobbies.foreach { println }
    println("-------------way 2 --------------------")
    hobbies.foreach((e:String)=> println(e))
    //or
    //hobbies.foreach(println(_))

    println("-------------way 3 --------------------")
    for(h<-hobbies)  println(h)

    println("-------------way 4 --------------------")
    for (hobby <- hobbies) {
      println(hobby)
    }


  }
}