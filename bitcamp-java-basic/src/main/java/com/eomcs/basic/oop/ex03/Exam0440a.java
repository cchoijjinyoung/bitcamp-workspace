package com.eomcs.basic.oop.ex03;


public class Exam0440a {

  static class Score {
    String name;
    int kor;
    int eng;
    int sum;

    Score() {
      this("dlfma");

    }
    Score(String name) {
      this(name,0, 0);
    }

    Score(String name, int kor, int eng) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.compute();
}
    public void compute() {
      this.sum = this.kor + this.eng;
    }

    public static void main(String[] args) {
      Score s1 = new Score();
    }
    Score s2 = new Score("dbrhkstns");
  }
  Score s3 = new Score("dlaRjrwjd", 100, 90);

}





