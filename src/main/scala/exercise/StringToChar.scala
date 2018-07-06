package exercise

case class StringToChar() {
  def convertStr(strList: List[String]): List[Char] = strList.flatMap(s => s.toCharArray)
}
