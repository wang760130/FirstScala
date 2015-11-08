package com.jerry.scala.p3

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * List常用操作
 */
object OperationListArray {
  def main(args: Array[String]): Unit = {
    var nums = List(1,2,3,4,5)
    println(nums)
    
    //判断是否为空
    println(nums.isEmpty)
    
    //取第一个无素
    println(nums.head)
    
    //取除第一个元素外剩余的元素，返回的是列表
    println(nums.tail)
    
    //取列表第二个元素
    println(nums.tail.head)
    
    //插入排序算法实现
    def isort(xs : List[Int]) : List[Int] = 
      if(xs.isEmpty) Nil
      else insert(xs.head, isort(xs.tail))
        
    def insert(x: Int, xs: List[Int]) : List[Int] = 
      if(xs.isEmpty || x <= xs.head) x :: xs
      else xs.head :: insert(x, xs.tail)
     
     //List连接操作
     println(List(1,2,3) ::: List(4,5,6))
     
     //取除最后一个元素外的元素，返回的是列表
     println(nums.init)
     
     //取列表最后一个元素
     println(nums.last)
     
     //列表元素倒置
     println(nums.reverse)
     
     //一些好玩的方法调用
     println(nums.reverse.reverse == nums)
     
     println(nums.reverse.init)
     
     println(nums.reverse.reverse)
     
     //丢弃前n个元素
     println(nums drop 3)
     
     println(nums drop 1)
     
     //获取前n个元素
     println(nums take 1)
     
     println(nums.take(3))
     
     //将列表进行分割
     println(nums.splitAt(2))
     
     //前一个操作与下列语句等同
     println((nums.take(2),nums.drop(2)))
     
     //Zip操作
     val chars = List('1','2','3','4')
     println(chars)
     
     //返回的是List类型的元组(Tuple）
     println(nums zip chars)
     
     //返回的是List类型的元组(Tuple）
     println(nums.toString)
     
     //List mkString方法
     println(nums.mkString)
     
     //转换成数组
     println(nums.toArray)
  }
}