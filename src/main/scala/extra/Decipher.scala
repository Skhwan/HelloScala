package extra

case class Decipher() {
  val numCode = Map[Int, String](
    1 -> "     |  |",
    2 -> " _  _|||_ ",
    3 -> " _  _| _|",
    4 -> "   |_|  |",
    5 -> " _ |_  _|",
    6 -> " _ |_ |_|",
    7 -> " _   |  |",
    8 -> " _ |_||_|",
    9 -> " _ |_| _|",
    0 -> " _ | ||_|"
  )
  def decipher(s: String) = {
    var numStr = List[String]("","","","","","","","","")
    val rawStr = s.split("n").flatMap(x => x.split(""))
    
  }
}

