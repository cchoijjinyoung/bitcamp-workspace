package com.eomcs.basic.ex07;

public class Exam0230 {

  static String hello() {

    return "안녕하세요!";

  }

  public static void main(String[] args) {

    String r = hello();
    System.out.println(r);

    hello();
  }
  }