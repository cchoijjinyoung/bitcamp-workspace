// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0970a {

 static class Monitor {
   int bright;
   int contrast = 50;
   int widthRes;
   int heightRes = 1080;

   Monitor() {
     this(50, 50, 2560, 1200);
     System.out.println("Monitor()");
   }

   Monitor(int bright, int contrast) {
     this(bright, contrast, 2560, 1200);
     System.out.println("Monitor(int, int)");
   }

   Monitor(int bright, int contrast, int widthRes, int heightRes) {
     this.bright = bright;
     this.contrast = contrast;
     this.widthRes = widthRes;
     this.heightRes = heightRes;
     System.out.println("Monitor(int, int, int, int");
   }

   void display() {
     System.out.println("------------------------");
     System.out.printf("qkfrrl(%d)\n", this.bright);
     System.out.printf("auddka(%d)\n", this.contrast);
     System.out.printf("gotkdeh(%d * %d)\n", this.widthRes, this.heighRes);

     System.out.println("-------------------");
   }
public static void main(String[] args) {

  Monitor m1 = new Monitor();
  System.out.println("------------------------");
  Monitor m2 = new Monitor();
  System.out.println("------------------------");
  Monitor m3 = new Monitor();
  System.out.println("------------------------");

  m1.display();
  m2.display();
  m3.display();
}


   }
   }






