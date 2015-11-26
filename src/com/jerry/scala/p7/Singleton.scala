package com.jerry.scala.p6

/**
 *  Scala入门到精通——第七节：类和对象（二）
 *  http://blog.csdn.net/lovehuangjiaju/article/details/47011273
 *  单例对象
 */
object Singleton {
  private var student:Int = 0
  def uniqueStudent() = {
    student+=1
    student
  }
  
  def main(args: Array[String]): Unit = {
    println(Singleton.uniqueStudent())
  }
}

/*******************************/
// 令查看字节码文件内容
/*Compiled from "Student.scala"
public final class cn.scala.xtwy.Student$ {
  public static final cn.scala.xtwy.Student$ MODULE$;
  private int studentNo;
  public static {};
  private int studentNo();
  private void studentNo_$eq(int);
  public int uniqueStudentNo();
  private cn.scala.xtwy.Student$();
}

Compiled from "Student.scala"
public final class cn.scala.xtwy.Student {
  public static void main(java.lang.String[]);
  public static int uniqueStudentNo();
}*/

// 不难看出，object Student最终生成了两个类，分别是Student与Student，它们都是final类型的，
// 而且Student的构造方法是私有的，通过静态成员域 public static final cn.scala.xtwy.Student$ MODULE$; 
// 对Student$进行引用，这其实是java语言中单例实现方式。 
// 单例对象的使用方式同Java语言类引用静态成员是一样的。
