// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0860a {

  static class A {
    int a = 100;
    {
      this.a = 200;
      System.out.println("초기화 블록");

    }

    A() {
      System.out.println("A()");
      }

    A(int a) {
      System.out.println("A()");

      this.a = a;
    }
  }
   public static void main(String[] args) {
     A obj1 = new A();
     A obj2 = new A();
  }
  }




