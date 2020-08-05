package com.eomcs.oop.ex01;

// # 클래스 사용 : 4) 메서드 활용
//
public class Exam0113a {

  static class Score {
    String name;
    int kor;
    int eng;
    int sum;
    float aver;
  }

  public static void main(String[] args) {

    Score s = new Score();

    s.name = "ghd";
    s.kor = 100;
    s.eng = 90;
    printScore(s);
  }
  static void printScore(Score s) {
    s.sum = s.kor + s.eng;
    s.aver = s.sum /2;
  }
  }






