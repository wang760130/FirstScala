package com.jerry.scala.p14

/**
 * Scala入门到精通——第十四节 Case Class与模式匹配（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47176829
 * 模式匹配入门
 */
object PatternMatching {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 100) {
      var x = 0
      i match {
        //后面可以跟表达式
        case 10 => x=10
        case 50 => println(50)
        case 80 => println(80)
        //增加守卫条件
        case _ if(i%4==0) => println(i+":能被4整除")
        case _ if(i%3==0) => println(i+":能被3整除")
        case _ =>
      }
    }
  }
}