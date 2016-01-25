package com.jerry.scala.p16

/**
 * Scala入门到精通——第十七节 类型参数（一）
 * http://blog.csdn.net/lovehuangjiaju/article/details/47264365
 * 上界（Upper Bound）与下界（Lower Bound）
 */

class Pair1[T](val first:T,val second:T){
  //下界通过[R >: T]的意思是
  //泛型R的类型必须是T的超类
  def replaceFirst[R >: T](newFirst:R)= new Pair1[R](newFirst,second)
  override def toString()=first+"---"+second
}

//Book类
class Book(val name:String){
  override def toString()="name--"+name
}
//Book子类Ebook
class Ebook(name:String) extends Book(name)
//Book子类Pbook
class Pbook(name:String) extends Book(name)
//Pbook子类,WeridBook
class WeirdBook(name:String) extends Pbook(name)

object LowerBound extends App{

   val first = new Ebook("hello")
   val second = new Pbook("paper book")


   val p1 = new Pair1(first,second)
   println(p1)
    //scala> val p1 = new Pair1(first,second)
   //p1: Pair1[Book] = name--hello---name--paper book
   //Ebook,Pbook，最终得到的类是Pair1[Book]

   val newFirst = new Book("generic pBook")
   val p2 = p1.replaceFirst(newFirst)
   //p2: Pair1[Book] = name--generic pBook---name--paper book
   println(p2)

   val weirdFirst:WeirdBook= new WeirdBook("generic pBook")
   val p3 = p1.replaceFirst(weirdFirst)
   //p3: Pair1[Book] = name--generic pBook---name--paper book

   val p4 = new Pair1(second,second)
   //p4: Pair1[Pbook] = name--paper book---name--paper book
   println(p4)
   val thirdBook=new Book("Super Books")
   val p5=p4.replaceFirst(thirdBook)
   println(p5)

   //下面这条语句会报错
   //type mismatch; found : cn.scala.xtwy.lowerbound.Pair1[cn.scala.xtwy.lowerbound.Pbook] required: cn.scala.xtwy.lowerbound.Pbook
   // val p6:Pbook= p4.replaceFirst(weirdFirst)   
}