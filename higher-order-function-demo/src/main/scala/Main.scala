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

    val fruitBasket = List(
      apple1, orange, kiwi, apple2, orange, kiwi, apple3, orange, kiwi
    )
    // println(fruitBasket)
    val f = fruitBasket.find(_.name=="apple").get
    println("Apple = " + f.name + " : " + f.color)

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

}