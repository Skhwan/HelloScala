package exercise.Retry

import scala.util.{Failure, Success, Try}

object retry {
  def apply[T](f: => T)(implicit retries: RetryOptions = RetryOptions(3, 0)): Try[T] = {
    Try {f} match {
      case Success(e) => Success(e)
      case _ if retries.times > 0 =>
        Thread.sleep(retries.sleep)
        apply(f)(RetryOptions(retries.times - 1, retries.sleep))
      case Failure(e) => Failure(e)
    }
  }
}