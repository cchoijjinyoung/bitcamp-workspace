package com.eomcs.basic.oop.ex04;

public class Exam0111 {
 public static void main(String[] args) throws Exception {
   //생성자를 호출하여 문자열 인스턴스를 초기화시킨다.

   // => 문자열 리터럴을 사용하여 스트링 인스턴스를 초기화.
   String s1 = new String("Hello");


   // 캐릭터 배열을 사용하여 스트링 인스턴스 초기화.
   char[] chars = new char[] {'h', 'e', 'l', 'l', 'o'};
   String s2 = new String(chars);


   // 바이트 배열을 사용하여 스트링 인스턴스 초기화.
   byte[] bytes = {
       (byte)0x48,
       (byte)0x65,
       (byte)0x6c,
       (byte)0x6c,
       (byte)0x6f,


   };

   String s3 = new String(bytes);

   System.out.printf("%s, %s, %s\n", s1, s2, s3);
 }
 }







