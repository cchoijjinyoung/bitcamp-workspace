// 메서드 오버로딩(overloading) - 문법 사용 전
package com.eomcs.oop.ex06.b;

public class Exam111 {

  static class Calculator {
    static int plusi(int a, int b) {
      return a + b;

    }

    static int plusi2(int a) {
      return a + a;
    }

    static float plusf(float a, float b) {
      return a + b;
    }

  }

  public static void main(String[] args) {
    int r1 = Calculator.plusi(100, 200);
    int r2 = Calculator.plusi2(100);
  }
}








