//변수 선언
//- 데이터를 저장할 메모리를 확보하는 명

package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    
    int x, y, z;
    
    i = 100;
    x = i;
    y = i * x;
    
    byte b1 = 10; // 00001010
    byte b2 = 12; // 00001100
      
    b1 = b2;    // 00001100
     
    i = b1;   //00000000000000000000000001100
    
    b2 = (byte)i;
    
    int a = 100;
    int b = 200;
    
    System.out.println(a);
    
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10;
    xx = 12;
    xx = 78;
    
    
    
    
    
  }
}
