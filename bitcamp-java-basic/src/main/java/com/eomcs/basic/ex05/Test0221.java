package com.eomcs.basic.ex05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)
//
public class Test0221 {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1 * f2 == 0.01f);
    
    System.out.println(f1 * f2);
    
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
    
    
  }
}