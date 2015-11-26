package com.jerry.scala.p6


/**
 *  Scala入门到精通——第七节：类和对象（二）
 *  http://blog.csdn.net/lovehuangjiaju/article/details/47011273
 *  伴生对象与伴生类
 */

/**
 * 在object Student所在的文件内定义了一个class Student，
 * 此时object Student被称为class Student的伴生对象，
 * 而class Student被称为object Student的伴生类
 */

class Student(var name:String , age:Int) {
  private var sex:Int = 0
  def printCompanionObject() = println(Student.student)
}
object Student{
  private var student:Int=0
  def uniqueStudent() = {
    student+=1
    student
  }
  
  def main(args: Array[String]): Unit = {
    println (Student.uniqueStudent())
    
    val student = new Student("John",29)
    //直接访问伴生类Student中的私有成员
    println(student.sex)
  }
}

//生成的字节码文件如下
/*public class cn.scala.xtwy.Student {
  private java.lang.String name;
  private int age;
  public static void main(java.lang.String[]);
  public static int uniqueStudentNo();
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public int age();
  public void age_$eq(int);
  public cn.scala.xtwy.Student(java.lang.String, int);
}

Compiled from "Student.scala"
public final class cn.scala.xtwy.Student$ {
  public static final cn.scala.xtwy.Student$ MODULE$;
  private int studentNo;
  public static {};
  private int studentNo();
  private void studentNo_$eq(int);
  public int uniqueStudentNo();
  public void main(java.lang.String[]);
  private cn.scala.xtwy.Student$();
}*/