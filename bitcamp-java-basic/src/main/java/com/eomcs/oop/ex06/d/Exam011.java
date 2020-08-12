// 다형적 변수와 오버라이딩
package com.eomcs.oop.ex06.d;

public class Exam011 {
  public static void main(String[] args) {
    A a = new A();
    a.m();
    System.out.println("-----------------");

    A2 a2 = new A2();
    a2.m();
    a2.x();
    System.out.println("-----------------");

    A a3 = new A2();
    a3.m();


    ((A2)a3).x();
    System.out.println("------------------");
  }
  }





