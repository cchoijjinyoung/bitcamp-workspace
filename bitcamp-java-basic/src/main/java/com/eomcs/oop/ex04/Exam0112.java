package com.eomcs.basic.oop.ex04;

public class Exam0112 {
  public static void main(String[] args) throws Exception {


    // 한글 문자의 바이트 배열을 가지고 스트링 인스턴스 초기화.
    byte[] bytes = {
        (byte)0xb0, (byte)0xa1,
        (byte)0xb0, (byte)0xa2,
        (byte)0xb6, (byte)0xca,
        (byte)0xb6, (byte)0xcb,

    };

    String s1 = new String(bytes);
    System.out.println(s1);

    String s2 = new String(bytes, "EUC-KR");
    System.out.println(s2);
  }
}







