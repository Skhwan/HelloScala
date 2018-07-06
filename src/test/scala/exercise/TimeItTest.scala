package exercise

import org.scalatest.FunSuite

class TimeItTest extends FunSuite {
  assert(TimeIt().timeIt(Gcd().gcd(2,4)) < TimeIt().timeIt(Gcd().gcd(50, 5050)))
  assert(TimeIt().timeIt(Gcd().gcd(3,9))!= TimeIt().timeIt(Gcd().gcd(2, 4)))
  assert(TimeIt().timeIt(Gcd().gcd(2,2)) == TimeIt().timeIt(Gcd().gcd(2, 4)))
  assert(TimeIt().timeIt(Gcd().gcd(2,4)) == TimeIt().timeIt(Gcd().gcd(2, 4)))
}
