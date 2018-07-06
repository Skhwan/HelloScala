package exercise

case class ReturnNotNone() {
  def getVal(x: Any = None, y: Any = None, z: Any = None): Any = (x, y, z) match
  {
    case (x, None, None) => x
    case (None, y, None) => y
    case (None, None, z) => z
    case (None, y, _) => y
    case (_, _, _) => x
  }
}
