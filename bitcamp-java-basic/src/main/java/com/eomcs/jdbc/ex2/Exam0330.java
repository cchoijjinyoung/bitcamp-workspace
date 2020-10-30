// 게시물 관리 - 목록
package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 다음과 같이 게시물 목록을 출력하라!
// 게시물 번호를 내림차순으로 정렬하라.
// ----------------------------
// 번호, 제목, 등록일, 조회수
// 2, aaa, 2019-1-1, 2
// 1, bbb, 2018-12-31, 3
// ----------------------------
public class Exam0330 {
  public static void main(String[] args) throws Exception {
    String no = null;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("번호? ");
      no = sc.nextLine();
    }
    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select * from x_board where board_id = ?")) {

      stmt.setString(1, no);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %d\n", //
            rs.getString("board_id"), //
            rs.getString("title"), //
            rs.getString("contents"), //
            rs.getString("created_date"), //
            rs.getString("view_count"));
      } else {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      }
    }
  }
}
}


