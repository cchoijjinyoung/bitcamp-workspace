package com.eomcs.basic.oop.ex03;


public class practicechoi {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;



  Score() {
    System.out.println("Score()");

  }
  Score(String name) {
    System.out.println("Score(String");
    this.name = name;
  }

  Score(String name, int kor, int eng, int math) {
    System.out.println("Score(String, int, int, int) 호출!");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();

  }

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.average = this.sum / 3f;
  }
  }
  public static void main(String[] args) {
    Score s1 = new Score();
    Score s2 = new Score("dbrhkstns");
    Score s3 = new Score("ghdrlfehd", 100, 90, 77);
  }
}






