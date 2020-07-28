package com.eomcs.basic.ex05;

// 비트 연산자 & 활용 : 픽셀에서 파란색의 값을 강화시키고 싶다.

public class Test0355 {
 public static void main(String[] args) {
   
   int pixel = 0x003f4478;
   System.out.println(Integer.toHexString(pixel | 0x00000057));
 
 
   
   

  }
}