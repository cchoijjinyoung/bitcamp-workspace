// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0930a {

  static class Monitor {

    int bright;
    int contrast;
    int widthRes;
    int heightRes;

    {
      this.bright = 50;

      if (this.bright < 50)
        this.contrast = 70;
      else
        this.contrast = 40;

      this.widthRes = 1920;
      this.heightRes = 1080;
    }

    void display() {
      System.out.println("===================");
      System.out.printf("밝기(%d)\n", this.bright);

    }
  }

  public static void main(String[] args) {
    Monitor m1 = new Monitor();
    m1.display();
    m1.bright = 40;
    m1.display();
  }
  }




