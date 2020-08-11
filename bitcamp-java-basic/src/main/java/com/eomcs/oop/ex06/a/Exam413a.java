// 다형성 - 다형적 변수의 활용
package com.eomcs.oop.ex06.a;

public class Exam413a {
  public static void printCar2(Car2 car) {
    System.out.printf("ahepfaud: %s/n", car.model);
    System.out.printf("cc: %d\n", car.cc);
    System.out.println("-------------------");

  }

  public static void main(String[] args) {
    Sedan2 car1 = new Sedan2();
    car1.model = "xlzh";
    car1.cc = 800;

    Truck2 car2 = new Truck2();
    car2.model = "xkdlxksii";
    car2.cc = 10000;

    printCar2(car1);
    printCar2(car2);
  }
}




