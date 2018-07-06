package extra

import org.scalatest._

class IBeforeESpec extends FlatSpec with Matchers {

  "CheckIe" should "return true if input doesn't contain any 'ie' or 'ei'" in {
    IBeforeE().checkIe("abc") should be (true)
  }

  it should "return true if input contains 'ei' that follows 'c'" in {
    IBeforeE().checkIe("receive") should be (true)
  }

  it should "return true if input contains 'ie' that doesn't follow 'c'" in {
    IBeforeE().checkIe("believe") should be (true)
  }

  it should "return false if input contains 'ei' that doesn't follow 'c'" in {
    IBeforeE().checkIe("peit") should be (false)
  }

  it should "return false if input contains 'ie' that follows 'c'" in {
    IBeforeE().checkIe("ciet") should be (false)
  }

}
