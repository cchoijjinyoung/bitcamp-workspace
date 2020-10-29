package com.eomcs.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0360 {
  public static void main(String[] args) throws Exception {

    // Connection 은 AutoCloserble 인터페이스를 구현했기 때문에 try안에 넣을수있다.
    // -> finally 필요없다.
    try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();) {
      // Sql문을 서버에 보내는 역할. Dbms 프로토콜에 따라 가공해서 보냄.

      // 마리아디비의 커넥션 객체가 리턴하는 statement구현체의 이름은?

      int count = stmt.executeUpdate(
          "update x_board set view_count = view_count + 20" + " where board_id > 3");
      System.out.printf("%d 개 입력성공!", count);
    } catch (Exception e) {
      e.printStackTrace();
      }
    }
  }


