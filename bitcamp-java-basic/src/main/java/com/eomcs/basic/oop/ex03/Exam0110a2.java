package com.eomcs.basic.oop.ex03;


public class Exam0110a2 {
  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int sum;
      float aver;
    }

    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();

    s1.name = "ghd";
    s1.kor = 100;
    s1.eng = 90;
    s1.sum = s1.kor + s1.eng;
    s1.aver = s1.sum / 2f;

    s2.name = "dla";
    s2.kor = 80;
    s2.eng = 70;
    s2.sum = s2.kor + s2.eng;
    s2.aver = s2.sum / 2f;

    s3.name = "choui";
    s3.kor = 60;
    s3.eng = 90;
    s3.sum = s3.kor + s3.eng;
    s3.aver = s3.sum / 2f;
    }
}







