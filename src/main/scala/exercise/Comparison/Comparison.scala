package exercise.Comparison

object Comparison {
  implicit class DoubleComparator(thisVal: Double){
    def ~=(thatVal: Double)(implicit precision: DoublePrecision = DoublePrecision(0.1)) = {
      math.abs(thisVal - thatVal) < precision.value
    }
  }
}

