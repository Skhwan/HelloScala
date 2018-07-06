package exercise.Tree

case class IntTreeManager() {
  def contains(t: IntTree, v: Int) : Boolean = {
    t match {
      case EmptyTree => false
      case Node(elem, left, right) => elem == v || contains(left, v) || contains(right, v)
    }
  }

  def insert(t: IntTree, v: Int): IntTree = {
    t match {
      case EmptyTree => Node(v, EmptyTree, EmptyTree)
      case Node(elem, left, right) =>
        if(v < elem) insert(left, v)
        else if(v > elem) insert(right, v)
        else t
    }
  }
}
