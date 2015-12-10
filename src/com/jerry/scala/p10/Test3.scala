package com.jerry.scala.p10

/**
 * Scala入门到精通——第十节 Scala类层次结构、Traits初步
 * http://blog.csdn.net/lovehuangjiaju/article/details/47059827
 * Nothing、Null类型解析
 */
object Test3 {
  def main(args: Array[String]): Unit = {
    // an expression of type Null is ineligible for implicit conversion
    // type mismatch; found : Null(null) required: Int
    // var x:Int=null
    
    def error(msg:String):Nothing={
      throw new RuntimeException(msg)
    }

    def divide(x: Int, y: Int): Int =
      if (y != 0) 
        x / y
      else 
         error("can't divide by zero")
  }
}