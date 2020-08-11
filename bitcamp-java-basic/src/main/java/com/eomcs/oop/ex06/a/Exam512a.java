// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam512a {

  public static void main(String[] args) {
    Vehicle2 v = new Sedan2();

    // getClass() ?
    // => 레퍼런스가 가리키는 인스턴스의 실제 클래스 정보를 리턴한다.
    // => == 연산자를 사용하여 특정 클래스의 인스턴스인지 좁혀서 검사할 수 있다.
    //
    System.out.println(v.getClass() == Sedan2.class);
    System.out.println(v.getClass() == Car2.class);
    System.out.println(v.getClass() == Vehicle2.class);
    System.out.println(v.getClass() == Truck2.class);
    System.out.println(v.getClass() == Bike2.class);
  }

}




