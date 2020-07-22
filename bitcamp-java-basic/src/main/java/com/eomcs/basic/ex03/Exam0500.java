
// 주제 : 실행할 수 있는 클래스

package com.eomcs.basic.ex03;


//# 문자 리터
public class Exam0500 {
    public static void main(String[] args) {
      
      System.out.println(0x0041);
      System.out.println(0x41);
      System.out.println((char)'각');
      System.out.println((char)('각' + 1));
      System.out.println((char)0x41);
      System.out.println('A');
      System.out.println((int)'A');
      System.out.println('A' + 1);
      System.out.println((char)'A'+ 1);
      
      for (int i = 'A'; i <= 'z'; i++) {
        System.out.println((char)i);
        
        //숫자를 true/false 로 변환할 수 없다.
        //System.out.println((boolean)1);
      }
      
    
}
}

