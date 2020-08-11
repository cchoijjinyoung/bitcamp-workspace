package com.eomcs.basic.oop.ex02;
import com.eomcs.util.Calculator;

// # 레퍼런스 배열 - 사용 전
//
public class Exam0210p {




  public static void main(String[] args) {

    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(4);
    Calculator.multiple(5);
    Calculator.divide(6);

    System.out.println(Calculator.result);

    printResult(Calculator.result);
  }
}






