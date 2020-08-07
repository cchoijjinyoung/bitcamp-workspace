// 변수 자동 초기화 - 로컬 변수
package com.eomcs.basic.oop.ex03;

// 초기화블럭 - 스태틱 초기화블럭, 인스턴스 ㅊㄱㅎㅂㄹ;
public class Exam0610 {
  static class A {
    static int x = 100; // 변수 초기화 문장
    static void m1() {}
    //스태틱 변수 초기화 문장의 스태틱 블록의 앞부분에 생성.

    int y = 100;

    static {
      x = 200;
      System.out.println("static qmffhr");
  }
    // 클래스가 로딩되고,
    // 스태틱 필드가 생성된 후
    // 스태틱 블럭을 순서대로 실행한다.
    // ==> 스태틱블록을 여러개일 경우 어차피 컴파일과정에서 한개의 스태틱 블록으로 합침.


  //인스턴스 초기화블럭
  {
    y = 200;
    // 인스턴스가 생성되고
    // 즉시 블럭이 순서대로 실행.
    // 그 후 생성자 호출.

    //==> 인스턴스 블럭은 컴파일 과정에서 생성자의 처음부분에 삼입된다.
    System.out.println("인스턴스 qmffhr");
  }

  public A(int value) {
    y = 300;
    System.out.println("A() todtjdwk ghnfehla");
  }

  public A() {
    System.out.println("A() todtjdwk ghnfehla");
  }


  {
    System.out.println("인스턴스 qmffhr#2");
  }

  static {
      System.out.println("static qmffhr#2");
    }
  }
static class B {
  static int x = 100;
  int y = 1000;

  static {
    x = 200;
  }
  public B() {
    y = 3000;
  }

}

  public static void main(String[] args) {
    System.out.println("씰행");

    A obj1; // 래퍼런스를 선언할때는 클래스가 로딩되지 않는다.

   A.x = 100; // 스태틱 멤버를 사용할 때 사용된다.
   A.m1();
   System.out.println("-------------");
   new A(); // 인스턴스를 생성하기 전에 클래스가 로딩되지 않았따면 먼저 로딩한다.

   new A(100);
  }
}

