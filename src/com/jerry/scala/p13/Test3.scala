package com.jerry.scala.p13

/**
 * Scala入门到精通——第十三节 高阶函数
 * http://blog.csdn.net/lovehuangjiaju/article/details/47079383
 * 偏函数
 * 当函数有多个参数，而在我们使用该函数时我们不想提供所有参数（假设函数有3个函数），只提供0~2个参数，此时得到的函数便是偏函数
 */

object Test3 {
  def main(args: Array[String]): Unit = {
    Array("Hadoop","Hive","Spark")foreach(x=>println(x))
    //上面的代码等价于下面的代码
    def print(x:String)=println(x)
    Array("Hadoop","Hive","Spark")foreach(print)
  }
}