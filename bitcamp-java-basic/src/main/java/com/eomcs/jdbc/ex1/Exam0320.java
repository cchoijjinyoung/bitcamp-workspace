package com.eomcs.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0320 {
  public static void main(String[] args) throws Exception {

    // Connection 은 AutoCloserble 인터페이스를 구현했기 때문에 try안에 넣을수있다.
    // -> finally 필요없다.
    try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(
            "select * from x_board order by board_id asc"))
    // 서버에서 결과의 집합을 가져온게 아니다!!!! 헷갈리지말자
    // 서버에서 결과를 가져오는 일을 할 뿐이다.
    {

      boolean isReceived = rs.next(); // 가져왔으면 트루, 가져올 게 없다 false

      if (isReceived) {
        System.out.printf("%s, %s, %s, %s, %s\n",
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5));
       //컬럼 번호는 셀렉트문에서 설정한 컬럼순서이다.
      } else {
        System.out.println("서버에서 한개의 레코드를 가져오지 못했습니다.");
      }

      // Sql문을 서버에 보내는 역할. Dbms 프로토콜에 따라 가공해서 보냄.

      // 마리아디비의 커넥션 객체가 리턴하는 statement구현체의 이름은?

//      int count = stmt.executeUpdate(
//          "insert into x_board(title,contents) values('제목10','내용')");
//      System.out.printf("%d 개 입력성공!", count);
//    } catch (Exception e) {
//      e.printStackTrace();
//      }
    }
  }
}


