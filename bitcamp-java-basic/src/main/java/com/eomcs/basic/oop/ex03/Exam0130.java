package com.eomcs.basic.oop.ex03;


public class Exam0130 {
  static class A {
    static int b1;
    static boolean b2;
  }
  public static void main(String[] args) {
    // 인스턴스 변수


    A obj1 = new A();
    A obj2 = new A();

    //래퍼런스가 가리키는 인스턴스에서 해당 변수를 찾아 값을 넣는다.
    // 클래스 변수를 찾아 값을 넣는다.
    // 래퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라
    // 클래스 변수라면 컴파일러가 컴파일하는 과정에 정확하게
    // 클래스 변수를 가리키도록 기계어로 바꾼다.
    // 즉, 개발자가 래퍼런스를 통해 클래스 변수를 지정하더라도
    // 컴파일러가 클래스 변수로 인식하여 클래스 변수를 사용하는 코드로 변환.

    obj1.b1 = 100;
    obj2.b1 = 200;


    System.out.println(obj1.b1);
    System.out.println(obj2.b1);


  }
}







