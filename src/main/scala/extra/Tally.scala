package extra

case class Tally() {
  def sumScore(names: String) = {
    names.split("")
      .map(x => if (x == x.toLowerCase)(x, 1) else (x, -1))
      .groupBy(_._1.toLowerCase)
      .map(x => (x._1, x._2.reduceLeft((x,y) => (x._1.toLowerCase, x._2 + y._2)))).toSeq.sortBy(-_._2._2)
      .map(x => x._2)
  }
}
