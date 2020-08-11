// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a;

public class Exam111a {
  public static void main(String[] args) {
    Vehicle2 v = new Vehicle2();
    Bike2 b = new Bike2();
    Car2 c = new Car2();
    Sedan2 s = new Sedan2();
    Truck2 t = new Truck2();


    Vehicle2 v2 = null;

    v2 = b;
    v2 = c;
    v2 = s;
    v2 = t;

    v2 = b;

    v2.model = "xlzh";
    v2.capacity = 5;

  }
}









