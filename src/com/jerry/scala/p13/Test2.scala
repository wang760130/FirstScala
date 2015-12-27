package com.jerry.scala.p13

/**
 * Scala入门到精通——第十三节 高阶函数
 * http://blog.csdn.net/lovehuangjiaju/article/details/47079383
 * Scala中的常用高阶函数
 */

object Test2 {
   def main(args: Array[String]): Unit = {
     
     //map函数
     //这里面采用的是匿名函数的形式，字符串*n得到的是重复的n个字符串，这是scala中String操作的一个特点
     Array("spark","hive","hadoop").map((x:String)=>x*2)
     
     //在函数与闭包那一小节，我们提到，上面的代码还可以简化
     //省略匿名函数参数类型
     Array("spark","hive","hadoop").map((x)=>x*2)
     
     //单个参数，还可以省去括号
     Array("spark","hive","hadoop").map(x=>x*2)
     
     //参数在右边只出现一次的话，还可以用占位符的表示方式
     Array("spark","hive","hadoop").map(_*2)
     
     // List类型
     val list=List("Spark"->1,"hive"->2,"hadoop"->2)
     //写法1
     list.map(x=>x._1)
     //写法2
     list.map(_._1)
     list.map(_._2)
     
     // Map类型
     // 写法1
     Map("spark"->1,"hive"->2,"hadoop"->3).map(_._1)
     Map("spark"->1,"hive"->2,"hadoop"->3).map(_._2)
     
     //写法2
     Map("spark"->1,"hive"->2,"hadoop"->3).map(x=>x._2)
     Map("spark"->1,"hive"->2,"hadoop"->3).map(x=>x._1)
     
     //flatMap函数
     //写法1
     List(List(1,2,3),List(2,3,4)).flatMap(x=>x)
     //写法2
     List(List(1,2,3),List(2,3,4)).flatMap(x=>x.map(y=>y))
     
     // filter函数
     Array(1,2,4,3,5).filter(_>3)
     List("List","Set","Array").filter(_.length>3)
     Map("List"->3,"Set"->5,"Array"->7).filter(_._2>3)
     
     
     // reduce函数
     //写法1
     Array(1,2,4,3,5).reduce(_+_)
     
     List("Spark","Hive","Hadoop").reduce(_+_)
     
     //写法2
     Array(1,2,4,3,5).reduce((x:Int,y:Int)=>{println(x,y);x+y})
     
     Array(1,2,4,3,5).reduceLeft((x:Int,y:Int)=>{println(x,y);x+y})
     
     Array(1,2,4,3,5).reduceRight((x:Int,y:Int)=>{println(x,y);x+y})
     
     // fold函数
     Array(1,2,4,3,5).foldLeft(0)((x:Int,y:Int)=>{println(x,y);x+y})
     
     Array(1,2,4,3,5).foldRight(0)((x:Int,y:Int)=>{println(x,y);x+y})
     
     Array(1,2,4,3,5).foldLeft(0)(_+_)
     
     Array(1,2,4,3,5).foldRight(10)(_+_)
     
     (0 /: Array(1,2,4,3,5)) (_+_)
     
     (0 /: Array(1,2,4,3,5)) ((x:Int,y:Int)=>{println(x,y);x+y})
     
     //  scan函数
     //从左扫描，每步的结果都保存起来，执行完成后生成数组
     Array(1,2,4,3,5).scanLeft(0)((x:Int,y:Int)=>{println(x,y);x+y})
     
     //从右扫描，每步的结果都保存起来，执行完成后生成数组
     Array(1,2,4,3,5).scanRight(0)((x:Int,y:Int)=>{println(x,y);x+y})
   }
}