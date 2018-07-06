package exercise

import exercise.Queue.{MyReverseQueue, Queue}
import org.scalatest.FunSuite

class QueueTest extends FunSuite {
  var q = new Queue
  assert(q.get(0).isEmpty)
  q.put("A")
  q.put("B")
  q.put("C")
  assert(q.queue.nonEmpty)
  assert(q.get(0).contains("A"))
  assert(q.get(2).contains("C"))
  assert(q.get(-1).isEmpty)
  assert(q.get(q.queue.size).isEmpty)

  var rQ = new MyReverseQueue
  assert(rQ.get(0).isEmpty)
  rQ.put("ABC")
  rQ.put("DEF")
  assert(rQ.get(0).contains("CBA"))
  assert(rQ.get(1).contains("FED"))
  assert(rQ.get(-1).isEmpty)
  assert(rQ.get(rQ.queue.size).isEmpty)
}
