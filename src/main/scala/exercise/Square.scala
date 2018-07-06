package exercise

case class Square() {
  def squareList(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => y * y :: squareList(ys)
  }

  def squareListWithMapFunction(xs: List[Int]): List[Int] = xs map (x => x * x)
}
