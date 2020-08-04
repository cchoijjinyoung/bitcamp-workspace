
package com.eomcs.basic.ex07;

public class Exam0540 {

  public static void main(String[] args) {
    if (args.length < 4) {
      System.out.println("실행형식.");
      return;

    }

    int sum = 0;
    for (int i = 1; i < args.length; i++)
      sum += Integer.parseInt(args[i]);
    System.out.printf("이름: %s\n", args[0]);
    System.out.printf("총점: %d\n", sum);
    System.out.printf("aver: %.1f\n", sum / 3f);
  }
  }






