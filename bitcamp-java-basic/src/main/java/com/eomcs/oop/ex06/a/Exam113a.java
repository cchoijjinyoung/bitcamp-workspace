// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a;

public class Exam113a {
  public static void main(String[] args) {

    Vehicle2 v = new Vehicle2();
    Bike2 b = new Bike2();
    Car2 c = new Car2();
    Sedan2 s = new Sedan2();
    Truck2 t = new Truck2();

    Bike2 b2 = null;

    b2 = c;

    b2 = s;
    b2 = t;

  }
}
