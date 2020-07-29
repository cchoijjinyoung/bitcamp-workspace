package com.eomcs.basic.ex05;

// 비트 연산자 & 활용 : 픽셀에서 파란색의 값을 강화시키고 싶다.

public class Test0451 {
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
   int d2 = 0x0087;
   
   System.out.println(d1);
   System.out.println(d2);
   
   
   
   
   
   

   

  }
}