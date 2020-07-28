package com.eomcs.basic.ex05;

//논리 연산자 && , &

public class Test0352 {
 public static void main(String[] args) {
   
System.out.println(57 % 2 == 0 ? "짝수" : "홀수");

System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");

System.out.println((57 & 0b1) == 0 ? "짝수" : "홀수");

System.out.println((57 & 1) == 0 ? "짝수" : "홀수");

 
 
 
   
   

  }
}