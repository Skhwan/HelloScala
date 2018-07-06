package extra

import org.scalatest._

class DiceSpec extends FlatSpec with Matchers {

  "The roll result of a dice with 3 faces" should "be between 1 to 3" in {
    val result = Dice().rollDice("1d3")
    result >= 1 && result <= 3
  }

}
