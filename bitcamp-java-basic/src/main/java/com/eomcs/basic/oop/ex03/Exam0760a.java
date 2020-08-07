// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0760a {

  public static void main(String[] args) {
    Object obj1 = new Object() {
      {
        System.out.println("인스턴스 블록....");
      }
    };
  }
  }




