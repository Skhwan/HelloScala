package exercise

case class VectorManager(vector: List[Int]) {
  var sqrX: List[Int] = List()
  var sumX: Int = 0
  var sqrtX: Double = 0.0

  def square(): List[Int] = {
    lazy val result = vector.map(x => x * x)
    result
  }

  def sum(): Int = {
    lazy val sum = sqrX.foldLeft(0){(total, v) => total + v}
    sum
  }

  def sqrt(): Double = {
    lazy val sqrtOfSum:Double = math.sqrt(sumX)
    sqrtOfSum
  }

  def expose(): (List[Int], Int, Double) = {
    sqrX = square()
    sumX = sum()
    sqrtX = sqrt()

    println(sqrX)
    println(sumX)
    println(sqrtX)

    (sqrX, sumX, sqrtX)
  }

}