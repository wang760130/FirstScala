package com.jerry.scala.p4

import scala.collection.mutable

/**
 * Scala入门到精通——第四节 Set、Map、Tuple、队列操作实战
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * Set操作实战
 */
object SetTest {
  def main(args: Array[String]): Unit = {
    //由于immutable是默认导入的，因此要使用mutable中的集合的话
    //使用如下语句
    val mutableSet = mutable.Set(1,2,3)
    println(mutableSet)
    
    //不指定的话，创建的是immutable 集合
    val mutableSet2 = Set(1,2,3)
    println(mutableSet2)
    
    //定义一个集合
    //这里使用的是mutable
    val numsSet = Set(3.0,5)
    println(numsSet)
    
    //向集中添加一个元素，同前一讲中的列表和数组不一样的是
    //，Set在插入元素时并不保元素的顺序
    //默认情况下，Set的实现方式是HashSet实现方式，
    //集中的元素通过HashCode值进行组织
    val numsSet2 =  numsSet + 6
    println(numsSet2)
    
    for(i <- numsSet2) {
      println(i)
    }
    
    //如果对插入的顺序有着严格的要求，则采用scala.collection.mutalbe.LinkedHashSet来实现
    val linkedHashSet = scala.collection.mutable.LinkedHashSet(3.0,5)
    println(linkedHashSet)
    
    val linkedHashSet2 = linkedHashSet + 6
    println(linkedHashSet2)
  }
}