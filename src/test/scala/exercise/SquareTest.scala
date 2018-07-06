package exercise

import org.scalatest.FunSuite

class SquareTest extends FunSuite {
  val testList = List(2, 4, 6, 8)
  assert(Square().squareList(testList) == List(4, 16, 36, 64))
  assert(Square().squareListWithMapFunction(testList) == List(4, 16, 36, 64))
  assert(Square().squareList(testList) == Square().squareListWithMapFunction(testList))
}
