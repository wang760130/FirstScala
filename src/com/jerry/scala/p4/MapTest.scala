package com.jerry.scala.p4

/**
 * Scala入门到精通——第四节 Set、Map、Tuple、队列操作实战
 * http://blog.csdn.net/lovehuangjiaju/article/details/46984575
 * Map操作实战
 */
object MapTest {
  def main(args: Array[String]): Unit = {
    //直接初始化
    // ->操作符，左边是key,右边是value
    val map = Map("john" -> 21, "stephen" -> 22, "lucy" ->20)
    println(map)
    
    //immutable不可变，它不具有以下操作
//    map.clear()
    
    //创建可变的Map
    val mapMutable = scala.collection.mutable.Map("john" -> 21, "stephen" -> 22, "lucy" -> 20)
    println(mapMutable)
    
    //mutable Map可变，比如可以将其内容清空
//    mapMutable.clear()
//    println(mapMutable)
    
    //遍历操作1
    for(i <- mapMutable)
      println(i)
      
    //遍历操作2
    mapMutable.foreach(e => 
      { val (k, v) = e; println(k + ":" + v) }
    )
    
    //遍历操作3
    mapMutable.foreach(e => println(e._1 + ":" + e._2))
    
    //定义一个空的Map
    val map2 = new scala.collection.mutable.HashMap[String, Int]()
    println(map2)
    
    //往里面填充值
    map2.put("spark",1)
    println(map2)
    
    //判断是否包含spark字符串
    println(map2.contains("spark"))
    
    //-> 初始化Map，也可以通过 ("spark",1)这种方式实现(元组的形式）
    val map3 = scala.collection.mutable.Map(("spark",1),("hive",1))
    println(map3)
    
    //获取元素
    println(map3.get("spark"))
  }
}