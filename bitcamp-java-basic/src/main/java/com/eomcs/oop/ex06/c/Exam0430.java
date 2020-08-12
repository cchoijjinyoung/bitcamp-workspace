// 오버라이딩(overriding) - 상위 클래스의 래퍼런스로 하위 오버라이딩 호출
package com.eomcs.oop.ex06.c;

public class Exam0430 {
  public static void main(String[] args) {
    X4 x4 = new X4();
    x4.m1();

    ((X2)x4).m1();
  }
}

// this.메서드() 호출?
// => 현재 클래스부터 호출할 메서드를 찾는다.
//
// super.메서드() 호출?
// => 부모 클래스부터 호출할 메서드를 찾는다.







