package exercise.Set

class EmptySet extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  def union(x: IntSet): IntSet = x
  def intersect(x: IntSet): IntSet = this
  def excl(x: Int): IntSet = this
  def isEmpty = true
}
