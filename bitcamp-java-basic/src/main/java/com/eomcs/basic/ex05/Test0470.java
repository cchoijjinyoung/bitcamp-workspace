package com.eomcs.basic.ex05;

// 비트 연산자 & 활용 : 픽셀에서 파란색의 값을 강화시키고 싶다.

public class Test0470 {
 public static void main(String[] args) {
   
   final int JAVA = 0x0001;
   final int C = 0x0002;
   final int CPP = 0x0004;
   final int PYTHON = 0x0008;
   final int PHP = 0x0010;
   final int KOTLIN = 0x0020;
   final int GROOVY = 0x0040;
   final int JAVASCRIPT = 0x0080;
   final int TYPESCRIPT = 0x0100;
   final int GO = 0x0200;
   final int SQL = 0x0300;
   final int R = 0x4000;
   
   int d1 = JAVA | C | CPP | JAVASCRIPT;
   
   System.out.printf("Java : %b\n", (d1 & JAVA) == JAVA);
   System.out.printf("C : %b\n", (d1 & C) == C);
   System.out.printf("C++ : %b\n", (d1 & CPP) == CPP);
   System.out.printf("Python : %b\n", (d1 & PYTHON) == PYTHON);
   System.out.printf("PHP : %b\n", (d1 & PHP) == PHP);
   System.out.printf("Kotlin : %b\n", (d1 & KOTLIN) == KOTLIN);
   System.out.printf("Groovy : %b\n", (d1 & GROOVY) == GROOVY);
   System.out.printf("JavaScript : %b\n", (d1 & JAVASCRIPT) == JAVASCRIPT);
   System.out.printf("TypeScript : %b\n", (d1 & TYPESCRIPT) == TYPESCRIPT);
   System.out.printf("Go : %b\n", (d1 & GO) == GO);
   System.out.printf("SQL : %b\n", (d1 & SQL) == SQL);
   System.out.printf("R : %b\n", (d1 & R) == R);
   
   
   
   
   
   
   

   

  }
}