package com.eomcs.jdbc.ex2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class Exam0110 {
  public void main(String[] args) throws Exception {
  String title = null;
  String contents = null;

  try (Scanner sc = new Scanner(System.in)) {
    System.out.print("제목? ");
    title = sc.nextLine();

    System.out.print("내용? ");
    contents = sc.nextLine();

    System.out.println("입력하시겠습니까?(Y/n");
    String input = sc.nextLine();

    if (!input.equalsIgnoreCase("y") && input.length() != 0) {
      System.out.println("등록을 취소 하였습니다");
      return;
    }
  }

  try (Connection con = DriverManager.getConnection(
      "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
    Statement stmt = con.createStatement();) {
    String sql = String.format("insert into x_board(title, contents) values('%s', '%s')", title, contents
        );
    int count = stmt.executeUpdate(sql);
    System.out.println("입력 성공!");
}
}
}