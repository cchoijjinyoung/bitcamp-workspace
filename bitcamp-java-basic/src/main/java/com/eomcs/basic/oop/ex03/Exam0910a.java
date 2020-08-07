// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0910a {

  static class Monitor {

    int bright;
    int contrast;
    int widthRes;
    int heightRes;

    void display() {
      System.out.println("----------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d)\n", this.widthRes, this.heightRes);
      System.out.println("----------------");


    }
  }
  public static void main(String[] args) {

    Monitor m1 = new Monitor();

    m1.display();

    m1.bright = 50;
    m1.contrast = 50;
    m1.widthRes = 1920;
    m1.heightRes = 1080;

    m1.display();
  }
  }




