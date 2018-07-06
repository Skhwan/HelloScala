package exercise

case class Median() {
  def median(num: Seq[Double]): Option[Double] = {
    val sortedSeq = num.sortWith(_ < _)

    sortedSeq.length match {
      case x if x % 2 == 1 => Some(sortedSeq(x/2))
      case x if x% 2 == 0 && x > 0 => Some((sortedSeq(x/2 - 1) + sortedSeq(x/2))/2.0)
      case _ => None
    }
  }
}