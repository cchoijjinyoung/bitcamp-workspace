package com.eomcs.basic.oop.ex04;

import java.util.Date;

public class Exam0240 {
  public static void main(String[] args) throws Exception {
    Date d1 = new Date();

    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());

    Long millis = Date.parse("Sat, 12 Aug 1995 13:30:00 GMT");
    System.out.println(millis);

    Long currMillis = System.currentTimeMillis();

    java.sql.Date today = new java.sql.Date(currMillis);

    String str = today.toString();
    System.out.println(str);
    java.sql.Date d = java.sql.Date.valueOf("2019-12-30");
    System.out.println(d);


  }
}







