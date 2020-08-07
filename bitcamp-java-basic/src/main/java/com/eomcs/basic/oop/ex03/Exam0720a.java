// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0720a {

  static class A {
  int a;
  int b;
  int c;
  {
    a = 100;
    System.out.println("인스턴스 초기화 블록 실행");
  }
    public A() {
      a = 200;
      System.out.println("A() 생성자호출");

    }

  }

    public static void main(String[] args) {
      A obj1 = new A();
      System.out.printf("a=%d, b=%d, c=%d\n",obj1.a, obj1.b, obj1.c);

    }
  }




