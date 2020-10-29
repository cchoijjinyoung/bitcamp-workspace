package com.eomcs.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0220 {
  public static void main(String[] args) throws Exception {

    // Connection 은 AutoCloserble 인터페이스를 구현했기 때문에 try안에 넣을수있다.
    // -> finally 필요없다.
    try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111");) {


      System.out.println("DBMS 와 연결됨.");
      System.out.println(con.getClass().getName());


    } catch (Exception e) {
      e.printStackTrace();

      }
      System.out.println("DBMS와 연결 해제됨!");
    }
  }

