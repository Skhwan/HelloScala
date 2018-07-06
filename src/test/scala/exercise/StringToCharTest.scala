package exercise

import org.scalatest.FunSuite

class StringToCharTest extends FunSuite {
  assert(StringToChar().convertStr(List("abc", "def")) == List('a', 'b', 'c', 'd', 'e', 'f'))
  assert(StringToChar().convertStr(List("abc", "abd")) == List('a', 'b', 'c', 'a', 'b', 'd'))
  assert(StringToChar().convertStr(List("", "")) == List())
  assert(StringToChar().convertStr(List()) == List())
}
