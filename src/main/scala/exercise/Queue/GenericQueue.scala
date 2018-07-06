package exercise.Queue

trait GenericQueue[String] {
  def put(value: String)
  def get(index: Int): Option[String]
}