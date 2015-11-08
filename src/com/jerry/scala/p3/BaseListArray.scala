package com.jerry.scala.p3

/**
 * Scala入门到精通——第三节 Array、List
 * http://blog.csdn.net/lovehuangjiaju/article/details/46963721
 * List类型定义及List的特点
 */
object BaseListArray {
  def main(args: Array[String]): Unit = {
    //字符串类型List
    var fruit = List("Apple","Banana","Orange")
    println(fruit)
    
    //前一个语句与下面语句等同
    var fruit2 = List.apply("Apple","Banana","Orange")
    println(fruit2)
    
    //数值类型List
    var nums = List(1,2,3,4,5)
    println(nums)
    
    //多重List，List的子元素为List
    var diagMatrix = List(List(1,0,0), List(0,1,0), List(0,0,1))
    println(diagMatrix)
    
    //遍历List
    for(i <- nums) println("List Element:" + i)
    
    /**
     * 不难看出，List与Array有着诸多的相似之处，但它们有两个明显的区别： 
     * 1、List一但创建，其值不能被改变 
     * 如前面的nums，改变其值的话，编译器会报错
     * 2、List具有递归结构（Recursive Structure),例如链表结构
     * List类型和其它类型集合一样，它具有协变性（Covariant)，即对于类型S和T，
     * 如果S是T的子类型，则List[S]也是List[T]的子类型
     */
    var listStr:List[Object]=List("This","Is","Covariant","Example")
    println(listStr)
    
    //空的List，其类型为Nothing,Nothing在Scala的继承层次中的最低层
    //，即Nothing是任何Scala其它类型如String,Object等的子类
    var listStr2 = List()
    println(listStr2)
    
    var listStr3:List[String]=List()
    println(listStr3)
    
    
    // List常用构造方法
    //采用::及Nil进行列表构建
    val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
    println(nums2)
    
    //由于::操作符的优先级是从右往左的，因此上一条语句等同于下面这条语句
    val nums3 = 1::2::3::4::Nil
    println(nums3)
    
  }
}