// Object 클래스 - clone() 사용법 II
package com.eomcs.corelib.ex01;

// clone()은 인스턴스를 복제할 때 호출하는 메서드이다.

public class Exam172 {
  static class Engine implements Cloneable {
    int cc;
    int valve;

    public Engine(int cc, int valve) {
      this.cc = cc;
      this.valve = valve;
    }

    @Override
    public String toString() {
      return "Engine [cc=" + cc + ", valve=" + valve + "]";
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
      // TODO Auto-generated method stub
      return (Engine) super.clone();
    }


    }
  static class Car implements Cloneable {
    String maker;
    String name;
    Engine engine;

    public Car(String maker, String name, Engine engine) {
      this.maker = maker;
      this.name = name;
      this.engine = engine;

    }

    @Override
    public String toString() {
      return "Car [maker=" + maker + ", name=" + name + ", engine=" + engine + "]";
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
      // TODO Auto-generated method stub



    Car copy = (Car) super.clone();
    copy.engine = this.engine.clone();
    return copy;
  }
}

  public static void main(String[] args) throws Exception {
    Engine engine = new Engine(3000, 16);
    Car car = new Car("비트자동차", "비트비트", engine);
    Car car2 = car.clone();
    System.out.println(car == car2);
    System.out.println(car);
    System.out.println(car2);
    System.out.println(car.engine == car2.engine);

    car.engine.cc = 2000;
    System.out.println(car2.engine.cc);


  }

  }







