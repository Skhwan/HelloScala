package exercise

import exercise.Tree.{EmptyTree, IntTree, IntTreeManager, Node}
import org.scalatest.FunSuite

class TreeTest extends FunSuite {
  var tree: IntTree = Node(5, EmptyTree, EmptyTree)

  assert(IntTreeManager().contains(tree, 5))

  tree = IntTreeManager().insert(tree, 4)
  assert(IntTreeManager().contains(tree, 4))
}
