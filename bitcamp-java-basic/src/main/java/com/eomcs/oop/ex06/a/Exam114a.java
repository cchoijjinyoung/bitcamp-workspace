// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a;

public class Exam114a {

public static void main(String[] args) {
  Vehicle2 v = new Vehicle();
  Bike2 b = new Bike2();
  Car2 c = new Car2();
  Sedan2 s = new Sedan2();
  Truck2 t = new Truck2();

  Car2 c2 = null;

  c2 = s;
  c2 = t;

  c2 = s;

  c2.model = "xlzh";
  c2.capacity = 5;
  c2.cc = 898;
  c2.valve = 16;
}
}










