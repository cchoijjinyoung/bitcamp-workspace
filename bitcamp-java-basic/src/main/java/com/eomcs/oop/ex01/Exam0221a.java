package com.eomcs.oop.ex01;

//# 레퍼런스 배열 - 사용 후
//
public class Exam0221a {
  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int sum;
      float aver;
    }

      Score[] arr = new Score[3];

      arr[0] = new Score();
      arr[1] = new Score();
      arr[2] = new Score();

      arr[0].name = "ghd";
      arr[0].kor = 100;
      arr[0].eng = 90;
      arr[0].sum = arr[0].kor + arr[0].eng;
      arr[0].aver = arr[0].sum / 2f;

      arr[1].name = "dla";
      arr[1].kor = 100;
      arr[1].eng = 90;
      arr[1].sum = arr[0].kor + arr[0].eng;
      arr[1].aver = arr[0].sum / 2f;

      arr[2].name = "gdhd";
      arr[2].kor = 100;
      arr[2].eng = 90;
      arr[2].sum = arr[0].kor + arr[0].eng;
      arr[2].aver = arr[0].sum / 2f;


  }
}






