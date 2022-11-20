package entity

abstract class Fruit(
                      val name: String,
                      var color: String
                    ) {

  def changeColor(newColor: String): Unit = {
    color = newColor
  }
}