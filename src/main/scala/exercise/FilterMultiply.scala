package exercise

case class FilterMultiply() {
  def multiplyExistingValue(list: List[Int], map: Map[Int, Double]): List[Double] = list.flatMap(y => map.get(y).map(z => z * y))
}
