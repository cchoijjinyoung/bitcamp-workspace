package com.eomcs.basic.oop.ex04;

public class Exam0113 {
  public static void main(String[] args) throws Exception {


    byte[] bytes = {
        (byte)0x41,
        (byte)0x42,
        (byte)0x43,
        (byte)0xea,(byte)0xb0,(byte)0x80,

    };

    String s1 = new String(bytes);
    System.out.println(s1);
  }
}







