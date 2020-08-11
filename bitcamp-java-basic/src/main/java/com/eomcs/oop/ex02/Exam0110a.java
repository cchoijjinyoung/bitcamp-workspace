package com.eomcs.basic.oop.ex02;


public class Exam0110a {

  static class Score{
    String name;
    int kor;
    int eng;
    int sum;
    float aver;

    void computeScore() {
      this.sum = this.kor + this.eng;
      this.aver = this.sum / 2f;
    }
  }
  public static void main(String[] args) {
    Score s1;
    s1 = new Score();

    s1.name = "ghd";
    s1.kor = 100;
    s1.eng = 90;
    s1.computeScore();

    Score s2 = new Score();
    s2.name = "dla";
    s2.kor = 90;
    s2.eng = 100;
    s2.computeScore();

    printScore(s1);
    printScore(s2);
  }


  static void printScore(Score s) {
    System.out.printf("%s, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.sum, s.aver);

  }
}





