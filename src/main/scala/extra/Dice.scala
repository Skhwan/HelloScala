package extra

import scala.util.Random

case class Dice() {
  def rollDice(d: String): Int = {
    val num = d.split("d")
    val diceNum = num(0).toInt
    val faceNum = num(1).toInt
    // instead of foreach and mutable list, try to replace below code with foldLeft
    (0 until diceNum).foldLeft(0){(total, i) => total + Random.nextInt(faceNum) + 1 }
  }
}
