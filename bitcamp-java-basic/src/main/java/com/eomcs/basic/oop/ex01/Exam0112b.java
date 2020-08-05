package com.eomcs.oop.ex01;

// # 클래스 사용 : 3) 클래스 사용
//
public class Exam0112b {
  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int sum;
      float aver;

    }


    Score s = new Score();

    s.name = "ghd";
    s.kor = 100;
    s.eng = 90;
    s.sum = s.kor + s.eng;
    s.aver = s.sum / 2f;
  }
  }







