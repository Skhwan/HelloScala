package exercise

import exercise.Comparison.Comparison._
import exercise.Comparison.DoublePrecision
import org.scalatest.FunSuite

class DoubleComparatorTest extends FunSuite {
  // precision = 0.1
  assert(1.5 ~= 1.45)     // 0.05
  assert(!(1.5 ~= 1.4))   // 0.1
  assert(!(1.5 ~= 1.35))  // 0.15

  implicit val precision2 = DoublePrecision(0.01)
  assert(1.155 ~= 1.15)   // 0.005
  assert(!(1.15 ~= 1.14)) // 0.01
  assert(!(1.5 ~= 1.45))  // 0.05
}
