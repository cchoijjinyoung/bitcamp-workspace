// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0830a {

  static class A {
    int a = 100;
    int b = 200;
    int c;

    public A() {

      c = 300;

    }
    public A(int a) {
      this.a = a;
      c = 300;
    }

    public A(int a, int b) {
      this.a = a;
      this.b = b;
      c = 300;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);
    System.out.println("--------------------------");

    A obj2 = new A(111);
    System.out.printf("a=%d, b=%d, c=%d\n", obj2.a, obj2.b, obj2.c);
    System.out.println("--------------------------");

    A obj3 = new A(111, 222);
    System.out.printf("a=%d, b=%d, c=%d\n", obj3.a, obj3.b, obj3.c);
    System.out.println("--------------------------");
  }
  }




