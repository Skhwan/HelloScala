package exercise

import org.scalatest.FunSuite

class StringManagerTest extends FunSuite {
  val testStr = "lkamlda sa ld;a sa"
  assert(StringManager(testStr).findCommonWord() == "sa")
  assert(StringManager(testStr).findCommonLetter() == 'a')
  assert(StringManager(testStr).findLongestWord() == "lkamlda")

  val result: Map[Char, Array[String]] = StringManager("a aa b bb c cc").mapWordToChar()
  assert(result.size == 3)
  assert(result.contains('a'))
  assert(result.contains('b'))
  assert(result.contains('c'))
  assert(!result.contains('r'))

  assert(result('a').length == 2)
  assert(result('a')(0) == "a")
  assert(result('a')(1) == "aa")

  assert(result('b').length == 2)
  assert(result('b')(0) == "b")
  assert(result('b')(1) == "bb")

  assert(result('c').length == 2)
  assert(result('c')(0) == "c")
  assert(result('c')(1) == "cc")
}
