package exercise

case class TimeIt() {
  def timeIt_[T](block: T): (T, Double) = {
    val start = System.nanoTime()

    val result = block

    val end = System.nanoTime()
    val time = (end - start)/1000d
    println(time + "ms")
    (result, time)
  }

  def timeIt[T](block: T) : T  = {
    timeIt_(block)._1
  }
}
