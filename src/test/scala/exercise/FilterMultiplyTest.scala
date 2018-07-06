package exercise

import org.scalatest.FunSuite

class FilterMultiplyTest extends FunSuite {
  val l = List(1, 2, 3, 4)
  val m = Map(1 -> 3.0, 3 -> 5.0)
  assert(FilterMultiply().multiplyExistingValue(l, m) == List(3.0, 15.0))
  assert(FilterMultiply().multiplyExistingValue(List(1, 2, 3), Map(4 -> 4, 5 -> 5)) == List())
  assert(FilterMultiply().multiplyExistingValue(List(), m) == List())
  assert(FilterMultiply().multiplyExistingValue(l, Map()) == List())
  assert(FilterMultiply().multiplyExistingValue(List(), Map()) == List())
}
