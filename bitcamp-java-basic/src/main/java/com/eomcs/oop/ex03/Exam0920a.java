// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0920a {

  static class Monitor {

    int bright = 50;
    int contrast = 50;
    int widthRes  = 1920;
    int heightRes = 1080;

    void display() {
      System.out.println("---------------");

    }
  }



  public static void main(String[] args) {
    Monitor m1 = new Monitor();

    m1.display();
    m1.bright = 40;
    m1.display();
  }
  }




