package extra

import org.scalatest._

class TallySpec extends FlatSpec with Matchers {
  "SumScore" should "compute score correctly" in {
    Tally().sumScore("dbbaCEDbdAacCEAadcB") should be (Vector(("b",2), ("d",2), ("a",1), ("c",0), ("e",-2)))
  }

  it should "still works fine with different input" in {
    Tally().sumScore("EbAAdbBEaBaaBBdAccbeebaec") should be (Vector(("c",3), ("d",2), ("e",1), ("a",1), ("b",0)))
  }
}
