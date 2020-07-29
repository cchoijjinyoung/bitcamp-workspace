package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 감소 연산자
//
public class Test0670 {
  public static void main(String[] args) {
    
    int a = 5;
    int r = ++a;
    System.out.printf("%d, %d\n", a, r);
    
    int b = 5;
    int t = b++;
    System.out.printf("%d, %d\n", b, t);
    
  }
}

