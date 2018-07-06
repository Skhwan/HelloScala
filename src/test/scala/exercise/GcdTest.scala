package exercise

import org.scalatest.FunSuite

class GcdTest extends FunSuite{
  assert(Gcd().gcd(15, 40) == 5)
  assert(Gcd().gcd(0, 0) == 0)
  assert(Gcd().gcd(0, 20) == 20)
  assert(Gcd().gcd(20, 0) == 20)
  assert(Gcd().gcd(-2, -6) == 2)
  assert(Gcd().gcd(-6, -2) == 2)
  assert(Gcd().gcd(-6, 2) == 2)
  assert(Gcd().gcd(-2, 6) == 2)
}
