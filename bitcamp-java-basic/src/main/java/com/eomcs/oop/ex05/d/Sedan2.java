package com.eomcs.oop.ex05.d;

public class Sedan2 extends Car2 {

  boolean sunroof;
  boolean auto;

  public Sedan2(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
    this.sunroof = sunroof;
    this.auto = auto;
  }
}
