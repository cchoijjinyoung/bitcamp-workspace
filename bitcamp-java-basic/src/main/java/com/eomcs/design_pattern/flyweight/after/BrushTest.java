package com.eomcs.design_pattern.flyweight.after;

import java.util.Scanner;

public class BrushTest {
  public static void main(String[] args) {
    BrushPool brushPool = new BrushPool();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("패턴? ");
      String pattern = sc.nextLine();

      System.out.print("선 길이? ");
      int length = Integer.parseInt(sc.nextLine());

      if (length < 0) {
        break;
      }

      Brush brush = new Brush(pattern);
      brush.draw(length);
    }

    sc.close();
  }
}
