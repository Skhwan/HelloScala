package exercise

import exercise.Set.{EmptySet, IntSet, NonEmptySet}
import org.scalatest.FunSuite

class SetTest extends FunSuite {
  var set: IntSet = new NonEmptySet(5, new EmptySet, new EmptySet)
  var set2: IntSet = new NonEmptySet(3, new EmptySet, new EmptySet)

  assert(!set.isEmpty)
  assert(set.contains(5))
  assert(set.excl(5).isEmpty)
  assert(set.incl(2).contains(2))

  set = set.incl(4)
  set2 = set2.incl(4)
  val set3 = set.intersect(set2)
  assert(set3.contains(4))
  assert(!set3.contains(3))
  assert(!set3.contains(5))

  val set4 = set.union(set2)
  assert(set4.contains(3))
  assert(set4.contains(4))
  assert(set4.contains(5))
}
