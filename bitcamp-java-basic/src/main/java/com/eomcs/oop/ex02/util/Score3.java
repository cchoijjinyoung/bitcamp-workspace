package com.eomcs.oop.ex02.util;

public class Score3 {

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void computeScore() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = (float)this.sum / 3;
  }

  public void init(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.computeScore();
  }
}
