package exercise

import exercise.Retry.{RetryOptions, retry}
import org.scalatest.FunSuite

class RetryTest extends FunSuite {
  var times = 0

  implicit val r = RetryOptions(2, 10)

  retry {
    times += 1
    throw new Exception
  }

  assert(times == 3)
}
