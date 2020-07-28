package com.eomcs.basic.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기
//
public class Exam0351 {
  public static void main(String[] args) {
    System.out.println(57 % 2);
    System.out.println(57 & 0b1);
    // 어떤 값에 대해 2로 나눈 나머지 값을 구하고 싶다면,
    // & 연산자를 이용하여 그 값의 하위 1비트 값만 추출하면 된다. 
    
    System.out.println(57 % 4);
    System.out.println(57 & 0b11);
    // 어떤 값에 대해 4로 나눈 나머지 값을 구하고 싶다면,
    // & 연산자를 이용하여 그 값의 하위 2비트 값만 추출하면 된다.

    // 주의!
    // & 연산자를 사용해서 나머지 값을 구하려면
    // 나누는 값이 2의 제곱수여야한다.
    // 즉 2의 제곱로 나눈 나머지 값을 구하는 경우에는
    // % 대신 비트 연산자 &를 사용하면 계산 속도가 빠르다
    // 권고
    // 너무 고민하지 말고 그냥 % 사용하라
    // 다른 개발자가 이해하기 편할것.
    // 그럼에도 불구하고 이 연산자의 응용법을 익히는 이유는
    // 가끔 오픈소스나 고급 개발자의 코드에서
    // 이런 코드를 만나기 때문이다.
    
    System.out.println(57 % 8);
    System.out.println(57 & 0b111);
    
    System.out.println(57 % 16);
    System.out.println(57 & 0b1111);
    
  }
}

