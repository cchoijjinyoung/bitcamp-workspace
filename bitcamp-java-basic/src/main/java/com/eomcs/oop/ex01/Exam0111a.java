package com.eomcs.oop.ex01;

// # 클래스 사용 : 2) 메서드 활용
//
public class Exam0111a {
  public static void main(String[] args) {
    String name;
    int kor;
    int eng;
    int sum;
    float aver;

    name = "ghd";
    kor = 100;
    eng = 80;

    printScore(name, kor,eng);
  }

  static void printScore(String name, int kor, int eng) {
    int sum = kor + eng;
    float aver = sum / 2f;
    System.out.println();
  }

  }
