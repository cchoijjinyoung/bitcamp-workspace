package com.eomcs.basic.ex05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)
//
public class Test0142 {
  public static void main(String[] args) {
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    
    int r1 = x + y;
    
    System.out.println(r1);
    
    long r2 = x + y;
    System.out.println(r2);
    
    r2 = (long)x + (long)y;
    
    System.out.println(r2);
    
  }
}