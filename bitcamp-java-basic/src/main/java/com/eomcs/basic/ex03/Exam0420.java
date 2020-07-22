// Exam0400.java
// 주제 : 실행할 수 있는 클래스

package com.eomcs.basic.ex03;


//# 문자 리터
public class Exam0420 {
    public static void main(String[] args) {
      
        System.out.println('A'); 
        System.out.println('가');
        System.out.println("\u0041"); //유니코드 값을 직접 지정
        System.out.println("\u4eba"); 
        System.out.println("\u0041");
        
//println()에게 문자 코드임을 알려줘라.
        
        System.out.println((char)0x41);
        System.out.println((char)65);
        System.out.println((char)0xd5d0);
        
        System.out.println('A'); // : 'A' => (char)0x0041
        
        System.out.println(65);
        System.out.println(0x41);
    //문자를 메모리에 저장하려면 2진수로 바꿀 수 있어야한다.
    //문자를 2진수로 바꾸는 규칙을 "문자집합(Character Set)"라 한다.
    
}
}

