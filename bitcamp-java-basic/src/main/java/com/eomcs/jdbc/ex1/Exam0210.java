package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0210 {
  public static void main(String[] args) throws Exception {

    java.sql.Connection con = null;
    try {
      con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111"
          );
      System.out.println("DBMS 와 연결됨.");
      System.out.println(con.getClass().getName());


    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        con.close(); // 항상 썼으면 닫아주자. 감동받음.
      } catch (Exception e) {

      }
      System.out.println("DBMS와 연결 해제됨!");
    }
  }
}

