package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberListCommand implements Command {
  @Override
  public void execute() {
    System.out.println("[회원 목록]");

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, name, password, photo, tel, cdt from pms_member order by no desc");
        ResultSet rs = stmt.executeQuery()) {

      System.out.println("번호, 이름, 암호, 사진, 전화번호, 가입일");
      while (rs.next()) {
        // 레코드에서 컬럼 값을 꺼낼 때 컬럼 번호를 지정하는 것 보다
        // 컬럼의 이름을 지정하는 것이 유지보수에 더 좋다.
        //
        System.out.printf("%d, %s, %s, %s, %s, %s\n", //
            rs.getInt("no"), //
            rs.getString("name"), //
            rs.getString("password"), //
            rs.getString("photo"), //
            rs.getString("tel"), //
            rs.getDate("cdt")); //
      }
  } catch (Exception e) {
    System.out.println("오류!");
  }
}


}