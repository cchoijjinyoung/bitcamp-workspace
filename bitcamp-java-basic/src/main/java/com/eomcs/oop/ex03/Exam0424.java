package com.eomcs.basic.oop.ex03;

static class SmartPhone {
  int volume;
  int bright;
  int contrast;
}

public SmartPhone() {

}

public SmartPhone(int value) {
  this.volume = volume;
  this.bright = 50;
  this.contrast = 50;
}

public class Exam0424 {


  }
   public static void main(String[] args) {
   // 인스턴트를 생성할 때 반드시 호출될 생성자를 지정해야 한다.
     // 안하면 문법 오류이다.
     // => new 클래스명(생성자에 넘겨 줄 값);
     // => 예) new A(); <-- 생성자에 파라미터가 없기 때문에 값을 넘겨주지 않는다.
     //    예) new A(100); <-- 생성자에 파라미터가 int 이기 때문에 정수 값을 넘긴다.

     // new A; // 컴파일 오류!

   SmartPhone obj2 = new SmartPhone();

   }
}






