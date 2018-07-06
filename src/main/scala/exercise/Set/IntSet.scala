package exercise.Set

trait IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
  def union(x: IntSet): IntSet
  def intersect(x: IntSet): IntSet
  def excl(x: Int): IntSet
  def isEmpty: Boolean
}
