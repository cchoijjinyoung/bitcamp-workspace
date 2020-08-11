package com.eomcs.oop.ex01;

//# 레퍼런스 배열 - 반복문 결합
//
public class Exam0230a {

  public static void main(String[] args) {
    class Score {
      String name;
      int kor;
      int eng;
      int sum;
      float aver;
    }

    Score[] arr = new Score[3];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Score();

    }
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

    for (int i = 0; i < arr.length; i++) {
      System.out.println("%s, %d, %d, %d, %.1f\n", arr[i].name, .args.clone().);
    }


  }
  }



