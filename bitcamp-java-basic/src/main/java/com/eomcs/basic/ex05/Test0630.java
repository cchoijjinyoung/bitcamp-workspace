package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 감소 연산자
//
public class Test0630 {
  public static void main(String[] args) {
    
    int i = 7;
    int j = i++;
    
    // 위 문장은 컴파일될 때 다음가 같은 형태로 변환된다.
    // => int j;
    // => int temp;
    // => temp = i;
    // => i = i + 1;
    // => i = temp;
    
    System.out.println(j);
    System.out.println(i);
    
  }
}
