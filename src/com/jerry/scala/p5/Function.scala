package com.jerry.scala.p5

/**
 * Scala入门到精通——第五节 函数与闭包
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * 函数
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
    
    //参数类型推断写法
    println(Array(1,2,3,4) map{(x) => x+1} mkString(","))
    
    //函数只有一个参数的话，可以省略()
    println(Array(1,2,3,4) map{x => x+1} mkString(","))
    
    //如果参数右边只出现一次，则可以进一步简化
    println(Array(1,2,3,4) map{_+1} mkString(","))
    
    //值函数简化方式
    //val fun0=1+_，该定义方式不合法，因为无法进行类型推断
//    val fun0 = 1+_
    
    //值函数简化方式（正确方式）  
    val fun1 = 1+(_:Double)
    println(fun1(999))
    
    //值函数简化方式
    val fun2:(Double) => Double = 1+_
    println(fun2(200))
    
    
    //函数参数(高阶函数）
    def convertIntString(f:(Int) => String) = f(4)
    println(convertIntString { (x:Int) => x+"s" })
    
    //高阶函数可以产生新的函数
    def multiplyBy(factor:Double) = (x:Double) => factor * x
    val x = multiplyBy(10)
    println(x)
    println(x(50))
  }
}