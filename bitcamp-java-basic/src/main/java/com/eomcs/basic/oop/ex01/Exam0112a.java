package com.eomcs.oop.ex01;

// # 클래스 사용 : 3) 클래스 사용
//
public class Exam0112a {
  public static void main(String[] args) {
    // 다음은 성적 정보를 저장할 메모리 구조를 클래스로 설계한 것이다.
    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    // 위에서 작성한 설계도에 따라 메모리를 준비해보자!
    Score s; // int 변수 선언하듯이 이렇게 하면 될까?
    //
    //
    s = new Score();


    //
    s.name = "홍길동"; // s에 저장된 주소로 찾아가서 name 항목에 값 저장
    s.kor = 100; // s에 저장된 주소로 찾아가서 kor 항목에 값 저장
    s.eng = 90;
    s.math = 80;
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;

    //
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}

