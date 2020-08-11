// 기존 코드를 복사하여 새 클래스를 만든 후에 코드를 추가했다.
package com.eomcs.oop.ex05.c;

public class Caar2 {
  String model;
  String maker;
  int capacity;
  boolean sunroof;
  boolean auto;

  public Caar2() {}

  public Caar2(String model, String maker, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;

  }

  public Caar2(String model, String maker, int capacity, boolean sunroof,
      boolean auto) {

    this(model, maker, capacity);

    this.sunroof = sunroof;
    this.auto = auto;
  }

}


