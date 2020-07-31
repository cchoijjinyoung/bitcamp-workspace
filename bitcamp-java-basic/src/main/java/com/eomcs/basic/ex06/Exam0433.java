
package com.eomcs.basic.ex06;

public class Exam0433 {
//  public static void main(String[] args) {
//    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
//    for (int i = 0; i < names.length; i++)
//      System.out.println(names[i]);
//
//    }
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 0)
          System.out.print(j + " ");

      }
      System.out.println();
    }
  }
    }

