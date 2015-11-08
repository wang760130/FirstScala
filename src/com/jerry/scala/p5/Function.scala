package com.jerry.scala.p5

/**
 * Scala入门到精通——第五节 函数与闭包
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 */
object Function {
  def main(args: Array[String]): Unit = {
    
    /*
     * 函数字面量 function literal
     *  =>左侧的表示输入，右侧表示转换操作
     */
    val increase = (x : Int) => x+1
    println(increase(10))
    
    //前面的语句等同于
    def increaseAnother(x:Int) = x+1
    println(increaseAnother(10))
    
    //多个语句则使用{}
    val increase2 = (x:Int) => {
      println("Xue")
      println("Tu")
      println("Wu")
      println("You")
      x+1
    }
    println(increase2(10))
    
    //数组的map方法中调用
    println(Array(1,2,3,4).map(increase).mkString(","))
    
    //匿名函数写法
    println(Array(1,2,3,4).map(( x:Int) => x+1 ).mkString(","))
    
    println(Array(1,2,3,4).map { (x:Int) => x+1 }.mkString(","))
    
    
  }
}