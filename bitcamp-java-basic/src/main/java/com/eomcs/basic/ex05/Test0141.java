package com.eomcs.basic.ex05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)
//
public class Test0141 {
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    float r = i / j;
    
    System.out.println(r);
    
    r = (float)i / (float)j;
    
    System.out.println(r);
    
  }
}