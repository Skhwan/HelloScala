package exercise

import org.scalatest.FunSuite

class MedianTest extends FunSuite {
  assert(Median().median(Seq(1.0, 2.0, 3.0)).contains(2))
  assert(Median().median(Seq(1, 2, 3, 4)).contains(2.5))
  assert(Median().median(Seq(3, 5, 1)).contains(3))
  assert(Median().median(Seq(3, 5, 4, 1)).contains(3.5))
  assert(Median().median(Seq(-2, 1, 0)).contains(0))
  assert(Median().median(Seq(-2, 0, -3, 1)).contains(-1))
  assert(Median().median(Seq()).isEmpty)
}
