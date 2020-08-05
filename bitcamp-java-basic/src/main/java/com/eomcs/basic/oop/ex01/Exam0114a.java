package com.eomcs.oop.ex01;

// # 클래스 사용 : 5) 메서드 활용 II
//
public class Exam0114a {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    Score s = createScore("ghd", 100, 90, 90);

    printScore(s);
  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;
  }

  static Score createScore(String name, int kor, int eng, int math) {
    Score s = new Score();
  }
  }



