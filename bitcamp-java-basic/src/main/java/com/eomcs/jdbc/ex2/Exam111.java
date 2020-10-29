package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam111 {
  public static void main(String[] args)throws Exception {
    String title = null;
    String contents = null;

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("제목? ");
      title = sc.nextLine();

      System.out.print("내ㅑ용?");
      contents = sc.nextLine();

      System.out.println("입력할꺼여? y/n");
      String input = sc.nextLine();

      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록 취소!");
        return;
      }
    }
    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement();) {

      String sql = String.format( //
          "insert into x_board(title,contents) values('%s','%s')", //
          title, contents);
      int count = stmt.executeUpdate(sql);
      System.out.printf("%d 개 입력 성공!", count);
    }
  }
}