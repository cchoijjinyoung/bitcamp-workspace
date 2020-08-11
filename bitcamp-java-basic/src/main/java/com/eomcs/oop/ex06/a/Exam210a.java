// 다형성 - 다형적 변수와 형변환
package com.eomcs.oop.ex06.a;

public class Exam210a {

public static void main(String[] args) {
  Vehicle2 v1 = new Sedan2();

  v1.model = "xlzh";
  v1.capacity = 5;

  ((Sedan2)v1).cc = 1980;
  ((Sedan2)v1).sunroof = true;

  System.out.printf("%s, %d, %d, %d, %b, %b\n", v1.model, v1.capacity,
      ((Sedan2)v1).cc, ((Sedan2)v1).sunroof);

  Sedan2 s = (Sedan2)v1;
  s.cc = 1980;
  s.valve = 16;
  s.sunroof = true;
  s.auto = true;

  System.out.printf("%s, %d, %b\n", s.model, s.cc, s.auto);

}

}




