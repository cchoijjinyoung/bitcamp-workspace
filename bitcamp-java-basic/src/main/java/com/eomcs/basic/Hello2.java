package com.eomcs.basic;

class Hello2 {
    public static void main(String[] args) {
        System.out.println("com/eomcs/basic/Hello2.java");
        System.out.println("Hello, world!");
    }
}

// 주제: 폴더를 구분하여 소스 파일 관리하기
// - 소스 파일을 단순히 폴더를 구분하여 분리한다고 해서 관리할 수 있는게 아니다.
// - 컴파일 하면 단순히 한 폴더에 놓여진다. 
// - package 명령을 사용하여 클래스의 소속을 지정해야 한다.
// java 폴더에 com eomcs basic이란 '패키지'. **주의점 src와 java를 패키지에 같이 묶지말것. - java는 폴더들을 관리하기위한
   // 일반폴더이지 패키지가 아니다.
// 소스파일위치와 패키지가 일치해야함.