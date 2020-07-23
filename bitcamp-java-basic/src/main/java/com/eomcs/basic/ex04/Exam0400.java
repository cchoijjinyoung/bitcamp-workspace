package com.eomcs.basic.ex04;

public class Exam0400 {
  public static void main(String[] args) {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str;
    Date date;
    
    b = -120;
    b = 127;
    
    //b = -129;
    //b = 128;
    
    b = 20 + 30; //리터럴 연산 결과는 리터럴로 취급한다.
    
    byte b2 = 20;
    //b = 100 + b2 //리터럴 + 변수 -> 4바이트 값을 1바이트에 x
    
    s = -32768;
    s = 32767;
    //s = -32769;
    //s = 32768;
    
    i = -21_0000_0000;
    i = 21_0000_0000;
    //i = -22_0000_0000;
    //i = 22_0000_0000;
    
    l = -922_0000_0000_0000_0000L;
    l = 922_0000_0000_0000_0000l;
    //l = -932_0000_0000_0000_0000L;
    //l = 932_0000_0000_0000_0000l;
    
    //b = 100L;
    //s = 100L; 
    //i = 100L;
    byte b3;
    b3 =b;
    //b3 = s;
    //b3 = i;
    //b3 = l;
    
    short s2;
    s2 = b;
    s2 = s;
    
    int i2;
    i2 = b;
    i2 = s;
    i2 = i;
    
    // long은 다 돼 8바이트 까지
    
    f = 2345678912.123456f;
    System.out.println(f);
    d = 234.5678;
    System.out.println(d);
    
    
    
    //부동소수점 연산한 결과가 7자리 이상
    //나올거 같으면 진작에 double 을 사용하라.
    double d1 = 1.234567;
    double d2 = 92345.22;
    double d3 = d1 + d2;
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    
        
  }

}
