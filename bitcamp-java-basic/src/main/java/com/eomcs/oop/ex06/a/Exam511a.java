// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam511a {

  public static void main(String[] args) {
    Vehicle2 v = new Sedan2();

    System.out.println(v instanceof Sedan2);
    System.out.println(v instanceof Car2);
    System.out.println(v instanceof Vehicle2);
    System.out.println(v instanceof Object);
    System.out.println(v instanceof Truck2);
    System.out.println(v instanceof Bike2);
  }
}




