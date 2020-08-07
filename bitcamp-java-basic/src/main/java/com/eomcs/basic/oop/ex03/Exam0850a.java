// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0850a {

  static class A {
    int b = 200;
    int c;

    A() {
      System.out.println("A()");
    }

    {
      a = 111;
      System.out.println("초기화 블록 실행");
    }

    int a = 100;

  }

  public static void main(String[] args) {
    A obj1 = new A();

  }
  }




