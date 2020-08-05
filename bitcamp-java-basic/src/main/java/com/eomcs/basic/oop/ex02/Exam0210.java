package com.eomcs.basic.oop.ex02;
import com.eomcs.util.Calculator;
// # 레퍼런스 배열 - 사용 전
//
public class Exam0210 {

  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    // 식 1 과 2 를 동시에 계산할 수 있는가?
    // => 불가능
    // => Calculator 는 result 변수를 한개만 관리하기 때문에.
    // => 동시에 여러 개의 계산 수행 불가능.

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c2.divide(3);

    printResult(c1.result);
  }

  static void printResult(int value) {
    System.out.println("----------------------");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("----------------------");

  }
}





