package com.eomcs.basic.ex04;
//상수 - 값을 바꿀 수 없는 변수

public class Exam0610 {
  public static void main(String[] args) {
    // 변수 
    int a;
    a = 100;
    a = 200;
    a = 300;
    
    // 변수의 값을 한 번 설정하면 바꾸지 못하게 막는 문법
    final int b;
    b = 100;
    //b = 200; // 컴파일 오류!  문법이 맞지 않아 컴파일 할 수 없는 것.
    
    // 상수 변수는 보통 선언과 동시에 값을 저장한다.
    
    final int c = 100;
    //c = 200; // 컴파일 오류! 
    
    final LENGTH = 100;
    
    int firstUserName;
    final int FIRST_USER_NAME; // 상수는 다 대문자.
    
    }
    
    
    
  }
