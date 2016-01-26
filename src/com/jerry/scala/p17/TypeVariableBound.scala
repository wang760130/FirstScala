package com.jerry.scala.p17

/**
 * Scala入门到精通——第十七节 类型参数（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47264365
 * 类型变量界定(Type Variable Bound)
 */
class TypeVariableBound {
  def compare[T <: Comparable[T]](first:T, second:T) = {
    //采用<:进行类型变量界定
    //该语法的意思是泛型T必须是实现了Comparable
    //接口的类型
    if(first.compareTo(second) > 0)
      first
    else 
      second
  }
}

case class Person(var name:String, var age : Int) extends Comparable[Person] {
  def compareTo(o:Person) : Int = {
    if(this.age > o.age) 1
    else if(this.age == o.age) 0
    else -1
  }
}

// 对类中的泛型进行范围限定
// 定义Student类为case class，且泛型T的类型变量界定为AnyVal
// 在创建类时，所有处于AnyVal类继承层次结构的类都是合法的
// 如Int、Double等值类型
case class Student[S,T <: AnyVal](var name:S,var hight:T)

object TypeVariableBound {
  def main(args: Array[String]): Unit = {
    var typeVariableBound =  new TypeVariableBound
    println(typeVariableBound.compare("A", "B"))
    println(typeVariableBound.compare(Person("stephen",19), Person("john",20)))
    
    // 下面这条语句是不合法的，因为String类型不属于
    // AnyVal类层次结构
    // val s1 = Student("john","170")
    
    // 下面这两条语句都是合法的，因为
    // Int,Long类型都是AnyVal
    val S2=Student("john",170.0)
    val S3=Student("john",170L)
  }
}