// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a;

public class Exam116a {

public static void main(String[] args) {
  Car2 c = new Car2();

  c.model = "xlzh";
  c.capacity = 5;
  c.cc = 890;
  c.valve = 16;

  Sedan2 s = (Sedan2)c;
  s.sunroof = true;
  s.auto = true;
}
}










