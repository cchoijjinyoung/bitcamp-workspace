package com.eomcs.basic.oop.ex03;


public class Exam0420 {

  static class SmartPhone {
    int volume;
    int bright;
    int contrast;
    void playMusic() {
    }
  }
    // 생성자란?
    // -인스턴스를 만든 후 사용하기 전에 적절값으로 초기화필요행
    // 재품 구동문제 없도록 기본값설정.
    // - 클래스 설계도에 따라 인스턴스를 생성한 후에
    // 인스턴스 변수가 사용되기 전에 적절한 값으로 초기화시키기 위해
    // 자동으로 호출하는 매서드.
    //

   public static void main(String[] args) {
   // 인스턴트를 생성할 때 반드시 호출될 생성자를 지정해야 한다.
     // 안하면 문법 오류이다.
     // => new 클래스명(생성자에 넘겨 줄 값);
     // => 예) new A(); <-- 생성자에 파라미터가 없기 때문에 값을 넘겨주지 않는다.
     //    예) new A(100); <-- 생성자에 파라미터가 int 이기 때문에 정수 값을 넘긴다.

     // new A; // 컴파일 오류!

   SmartPhone obj1 = new SmartPhone();

   obj1.playMusic();

   System.out.println(obj1.volume);
   System.out.println(obj1.bright);
   System.out.println(obj1.contrast);


  }
   }







