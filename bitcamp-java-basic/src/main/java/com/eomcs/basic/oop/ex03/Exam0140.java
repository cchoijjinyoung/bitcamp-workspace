package com.eomcs.basic.oop.ex03;


public class Exam0140 {
  static class A {
    static int v1;
    int v2;

  }

  public static void main(String[] args) {
    // 클래스 변수는 클래스가 로딩되는 시점에 Method area에 생성된다.
    // 클래스가 로딩되는 때?
    // - 로딩되지 않은 클래스를 사용할 때
    // - 클래스 변수(스태틱 변수)를 사용하거나
    //      클래스매서드(스태틱 매서드)를 사용하려 할 때


    A.v1 = 100;

    // 인스턴스 변수는 new로 인스턴스를 생성할 때 마다 heap에 생성된다.
    A obj1 = new A();
    A obj2 = new A();

    obj1.v2 = 200;
    obj2.v2 = 300;


  }
}







