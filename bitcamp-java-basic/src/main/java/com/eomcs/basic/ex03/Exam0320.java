

//주제 : 부동소수점을 저장하는 메모리의 크기

package com.eomcs.basic.ex03;

class Exam0320 //클래스 이름을 소스파일과 맞춰주자  - 클래스 선언 (class declaration)
{ //클래스 정의 (데피니션) 
    public static void main(String[] args) // 매서드 선언
    { // 매서드 정의 
        //부동소수점 리터럴은 기본으로 8바이트 크기를 갖는다.
       System.out.println(3.14d); // d 또는 D 를 붙여도 된다. D = double
       System.out.println(3.14f); // f 나 F 를 붙이면 4바이트 메모리에 저장한다 . F = float
    }
} 
