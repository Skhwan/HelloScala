package exercise

case class StringManager(rawStr: String) {
  val strArr = rawStr.split(" ")

  def findLongestWord(): String = strArr.maxBy(s => s.length)

  def findCommonWord(): String = {
    strArr.groupBy(s => s).maxBy(w => w._2.length)._1
  }

  def findCommonLetter(): Char = {
    strArr.flatMap(c => c.toCharArray)
      .groupBy(c => c)
      .maxBy(c => c._2.length)._1
  }

  def mapWordToChar() = {
    strArr.flatMap(s => s.toCharArray.map(c => (c, s))) //List((C, "WORD"), (C, "WORD"), ...)
      .groupBy(c => c._1) // Map(c -> List((c, "WORD"), (c, "WORD"))
      .mapValues(p => p.map(v => v._2).distinct)
  }
}