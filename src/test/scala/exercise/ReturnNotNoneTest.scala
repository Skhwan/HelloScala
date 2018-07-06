package exercise

import org.scalatest.FunSuite

class ReturnNotNoneTest extends FunSuite {
  assert(ReturnNotNone().getVal(3) == 3)
  assert(ReturnNotNone().getVal(None, 4) == 4)
  assert(ReturnNotNone().getVal(None, None, 5) == 5)
  assert(ReturnNotNone().getVal("a", None, 5) == "a")
  assert(ReturnNotNone().getVal(None, "b", 5) == "b")
  assert(ReturnNotNone().getVal("c", 5) == "c")
  assert(ReturnNotNone().getVal(3, 4, 5) == 3)
  assert(ReturnNotNone().getVal() == None)
}
