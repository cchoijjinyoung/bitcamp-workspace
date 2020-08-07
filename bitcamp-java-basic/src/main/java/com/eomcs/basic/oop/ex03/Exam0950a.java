// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0950a {

 static class Monitor {
   int bright;
   int contrast = 50;
   int widthRes;
   int heightRes = 1080;

   Monitor(int bright, int contrast) {
     this.bright = bright;
     this.contrast = contrast;

   }

   void display() {
     System.out.println("-------------------");
     System.out.printf("bright(%d)\n", this.bright);
     System.out.printf("contrast(%d)\n", this.contrast);
     System.out.printf("gotkdeh(%d)\n", this.widthRes, this.heightRes);
     System.out.println("---------------------");
   }
 }
 public static void main(String[] args) {
   Monitor m = new Monitor(50, 50);
   m.display();
 }
}




