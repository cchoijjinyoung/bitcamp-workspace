package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 감소 연산자
//
public class Test0650 {
  public static void main(String[] args) {
    
    int i = 2;
    int result = i++ + i++ * i++;
    
    System.out.printf("%d, %d\n", i, result);
    
    
  }
}
