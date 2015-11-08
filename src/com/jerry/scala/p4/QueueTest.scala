package com.jerry.scala.p4

/**
 * Scala入门到精通——第四节 Set、Map、Tuple、队列操作实战
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * Map操作实战
 */
object QueueTest {
  def main(args: Array[String]): Unit = {
    //immutable queue
    var queue = scala.collection.immutable.Queue(1,2,3)
    println(queue)
    
    //出队
    println(queue.dequeue)
    
    //入队
    println(queue.enqueue(4))
    
    //mutable queue
    var queue2 = scala.collection.mutable.Queue(1,2,3,4,5)
    println(queue2)
    
    //入队操作
    queue2 += 5
    println(queue2)
    
    queue2 ++= List(6,7,8)
    println(queue2)
  }
}