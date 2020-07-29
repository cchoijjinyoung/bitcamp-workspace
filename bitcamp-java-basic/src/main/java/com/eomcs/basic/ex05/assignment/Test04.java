package com.eomcs.basic.ex05.assignment;




//# 과제1 : 
// - 다음 int 변수에 들어 있는 값을
// - 각 자릿수의 10 진수 값을 역순으로 출력하라.
// 실행 예)
// 값: 23459876
// 6
// 7
// 8
// 9
// 5
// 4
// 3
// 2
public class Test04 {
 
  
  
  
  
    public static void main(String[] args) {
      
      
      
        int value = 23459876; // = 165f824
        int value2 = 0x165f824;
        int a, b, c, d;
        
        a = value >> 24;
        b = (value >> 16) & 0xff;
        c = (value >> 8) & 0xff;
        d = value & 0xff;
        
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toHexString(value));
        
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toHexString(d));
        
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        
        
        
    
    }
}










