package com.jerry.scala.p6

/**
 * Scala入门到精通——第六节：类和对象
 * http://blog.csdn.net/lovehuangjiaju/article/details/47011273
 * apply方法
 */

/**
 * 通过利用apply方法可以直接利用类名创建对象，例如前面在讲集合的时候，
 * 可以通过val intList=List(1,2,3)这种方式创建初始化一个列表对象，
 * 其实它相当于调用val intList=List.apply(1,2,3)，只不过val intList=List(1,2,3)这种创建方式更简洁一点，
 * 但我们必须明确的是这种创建方式仍然避免不了new，它后面的实现机制仍然是new的方式，
 * 只不过我们自己在使用的时候可以省去new的操作.
 */
//定义ApplyMethod类，该类称为伴生类，因为在同一个源文件里面，我们还定义了object ApplyMethod
class ApplyMethod(var name:String, var age:Int) {
  private var sex:Int = 0
  //直接访问伴生对象的私有成员
  def printCompanionObejct() = println(ApplyMethod.student)
}

//伴生对象
object ApplyMethod {
  private var student:Int = 0
  def uniqeStudent() = {
    student += 1
    student
  }
  
  //定义自己的apply方法
  def apply(name:String, age:Int) = new ApplyMethod(name, age);
  
  def main(args: Array[String]): Unit = {
    println(ApplyMethod.uniqeStudent())
    val applyMethod = new ApplyMethod("john",28)
    
    //直接访问伴生类Student中的私有成员
    println(applyMethod.sex)
    
    //直接利用类名进行对象的创建，这种方式实际上是调用前面的apply方法进行实现，这种方式的好处是避免了自己手动new去创建对象
    val applyMethod2 = ApplyMethod("jobh",29)
    println(applyMethod2.name)
    println(applyMethod2.age)
    
  }
}