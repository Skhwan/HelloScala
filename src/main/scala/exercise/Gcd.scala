package exercise

case class Gcd() {
  def gcd(x: Int, y:Int): Int = {
    y match {
      case 0 => Math.abs(x)
      case _ => gcd(y, x % y)
    }
  }
}
