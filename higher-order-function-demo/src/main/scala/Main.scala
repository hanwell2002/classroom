import entity.{Apple, Fruit, Kiwi, Orange}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val apple1 = new Apple
    apple1.changeColor("green")
    val apple2 = new Apple
    apple2.changeColor("yellow")
    val apple3 = new Apple
    val orange = new Orange
    val kiwi = new Kiwi

    println("apple1: " + apple1.name + "-->" + apple1.color)
    println("apple2: " + apple2.name + "-->" + apple2.color)
    println("apple3: " + apple3.name + "-->" + apple3.color)

    val fruitBasket = List(
      apple1, orange, kiwi, apple2, orange, kiwi, apple3, orange, kiwi
    )

    val one = fruitBasket.find(_.name=="apple")
   // val one = fruitBasket.find(_.name=="fruit_does_not_exists")
   //  println(one.get.name + "-> color: " + one.get.color)

    //safe way to check find result:
    one match {
      case Some(fruit) => println("Fruit name: " + fruit.name+ " --> " + fruit.color)
      case None => println("Matching None, i.e. found no fruit")
    }

    try {
     println(one.get)
    } catch {
      case e: Exception => println("got None")
    }

    println("#--------------------------------------#")
    val many = fruitBasket.filter(_.name == "apple")
    many.foreach{
      (a <- many) => println(a.color)
    }
    println("#--------------------------------------#")


    println(apple2.name)
    println(orange.name)
    println(kiwi.name)

    //var apples: List[Fruit] = getApples(fruitBasket)
    // for (apple <- getApples(fruitBasket)) println("Apple color => " + apple.color)
    println("========================")
    for (apple <- getApplesV2(fruitBasket)) println("Apple2 color => " + apple.color)
    println("========================")

    println(getApples(fruitBasket))
    println(getOrange(fruitBasket))
    println(getKiwis(fruitBasket))

    def getApples(basket: List[Fruit]): List[Fruit] = for (fruit <- basket if fruit.name == "apple") yield fruit

    def getApplesV2(basket: List[Fruit]) = getFruits(fruitBasket, (fruit: Fruit) => fruit.name == "apple")

    def getOrange(basket: List[Fruit]) = for (fruit <- basket if fruit.name == "orange") yield fruit

    def getKiwis(basket: List[Fruit]) = for (fruit <- basket if fruit.name == "kiwi") yield fruit

    //-------------------------------------
    def getFruits(basket: List[Fruit], filterByFruit: Fruit => Boolean) = for (fruit <- basket if filterByFruit(fruit)) yield fruit

    println("----------------------------------------")
    for (apple <- getApplesV2(fruitBasket)) println(">> Fruit color -> " + apple.color)
    println("----------------------------------------")

    val colored: String = Console.RED + "Hi, you are successfully entered Scala World!!" + Console.RESET
    println(colored)
  }

 /* public boolean compare(String name) {
    if(name.equals("apple"))
      return true
    else return false;
  }*/
}