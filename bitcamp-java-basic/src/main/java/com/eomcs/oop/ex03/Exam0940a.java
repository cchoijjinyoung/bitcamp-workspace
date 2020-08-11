// 스태틱 초기화 블록(static initializer) - 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.basic.oop.ex03;

public class Exam0940a {

 static class Monitor {
   int bright = 10;
   int contrast = 10;
   int widthRes = 480;
   int heightRes = 320;

   {
     System.out.println("인스턴스 초기화 블록 실행!");
     bright = 20;
     contrast = 20;
     widthRes = 800;
    heightRes = 600;
   }

   Monitor() {
     System.out.println("쌩성자실행!");
     this.bright = 50;
     this.contrast = 50;
     this.widthRes = 1920;
     this.heightRes = 1080;

   }
   void display() {
     System.out.println("----------------");
     System.out.printf("밝기(%d)\n", this.bright);
     System.out.printf("명암(%d)\n", this.contrast);
     System.out.printf("해상도(%d)\n", this.widthRes, this.heightRes);
   }
 }
 public static void main(String[] args) {
   Monitor m1 = new Monitor();

   m1.display();
   m1.bright = 40;
   m1.display();
 }
 }




