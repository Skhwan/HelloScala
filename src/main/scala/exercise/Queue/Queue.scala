package exercise.Queue

import scala.collection.mutable

class Queue extends GenericQueue[String] {

  var queue: mutable.ArrayBuffer[String] = mutable.ArrayBuffer()

  def put(value: String) = queue += value

  def get(index: Int): Option[String] = {
    if(index >= queue.size || index < 0) None
    else Some(queue(index))
  }
}