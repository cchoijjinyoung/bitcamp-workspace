package com.eomcs.basic.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");



    // 인스턴스 매서드
    // - non - static method
    // 인스턴스 주소를 가지고 호출해야한다,
    // this 라는 내장변수가 있소.
    // 특정 인스턴스의 변수를 다루는 매서드.


    char c1 = s1.charAt(1);
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo("Hellp"));

    System.out.println(s1.contains("He llo"));
    System.out.println(s1.equals(s2));


    byte[] bytes = s2.getBytes("UTF-8");
    for (byte b :bytes) {
      System.out.println(Integer.toHexString(b & 0xff)); //한글에 ffffff 붙는거 떄줌.
    }


    String s3 = String.format("%s님 방가방가!", "홍길동");
    System.out.println(s3);

    String s4 = String.join(",", "홍길동", "임꺽정", "유관순");
    System.out.println(s4);

    String s5 = String.valueOf(true);
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s, %s, %s\n", s5, s6, s7);

    Date d1 = new Date();
    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth());
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    Long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);

    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDate());

    Long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());



    System.out.println("----------------------------");

    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // 요일 (1 ~ 7)
    System.out.println(cal.get(4)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(10)); // 12 hour
    System.out.println(cal.get(11)); // 24 hour
    System.out.println(cal.get(12)); // minute
    System.out.println(cal.get(13)); // second


    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH));
    System.out.println(cal.get(Calendar.DATE));
    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
    System.out.println(cal.get(Calendar.HOUR));
    System.out.println(cal.get(Calendar.HOUR_OF_DAY));
    System.out.println(cal.get(Calendar.MINUTE));
    System.out.println(cal.get(Calendar.SECOND));

    // int => integer, byte => Byte, short => Short, long => Long
    // float => Float, double => Double, char => Character

    // Integer i1 = new Integer(100);
    // Integer i2 = new Integer(200);

    Integer i1 = Integer.valueOf(100);
    Integer i2 = Integer.valueOf(100);
    // i1 = 100, i2 = 100 으로 같은 값일경우 한 주소를 이용하기때문에
    // i1 == i2 (주소가 같냐 물어보았을 때) true가 나온다.
    // but 100, 200 으로 줬을 경우, 주소를 2개.


    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2);



  }
}







