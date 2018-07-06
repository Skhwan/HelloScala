package exercise

import org.scalatest.FunSuite

class VectorManagerTest extends FunSuite{
  assert(VectorManager(List(3, 4)).expose() == (List(9, 16), 25, 5))
  assert(VectorManager(List(-3, -4)).expose() == (List(9, 16), 25, 5))
  assert(VectorManager(List()).expose() == (List(), 0, 0))
}
