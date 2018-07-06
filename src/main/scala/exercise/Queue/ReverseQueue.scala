package exercise.Queue

trait ReverseQueue extends GenericQueue[String] {
  abstract override def put(value: String) = {
    super.put(value.reverse)
  }
}
