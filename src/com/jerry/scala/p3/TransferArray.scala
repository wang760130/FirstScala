package com.jerry.scala.p3
import scala.collection.mutable.ArrayBuffer
/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * 数组转换
 */
object TransferArray {
   def main(args: Array[String]): Unit = {
     val intArray = ArrayBuffer(1,2,3)
     println(intArray)
   
     //生成新的数组，原数组不变
     //缓冲数据转换后产生的仍然是缓冲数组
     val intArray2 = for(i <- intArray) yield i *2
     println(intArray2)
     
     var intArrayNoBuffer = Array(1,2,3)
     println(intArrayNoBuffer)
     
     //定长数组转转后产生的仍然是定长数组，原数组不变
     var intArrayNoBuffer2 = for(i <- intArrayNoBuffer) yield i * 2
     println(intArrayNoBuffer2)
     
     //加入过滤条件
     var intArrayNoBuffer3 = for(i <- intArrayNoBuffer if i >= 2) yield i * 2
     println(intArrayNoBuffer3)
   }
}