package com.eomcs.basic.ex05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)
//
public class Test0150 {
  public static void main(String[] args) {
    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = 5.5f;
    double d = 6.6;
    boolean bool = true;
    char c = 7;
    
    int r4 = b + i;
    int r5 = s + i;
    
  }
}