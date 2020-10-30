package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class MemberDetailCommand implements Command {


  @Override
  public void execute() {
    System.out.println("[회원 상세보기]");
    int no = Prompt.inputInt("번호? ");
    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, name, email, password, photo, tel, cdt"
            + " from pms_member"
            + " where no = " + no);
        ResultSet rs = stmt.executeQuery()) {
    if (rs.next()) {
    System.out.printf("이름: %s\n", rs.getInt("name"));
    System.out.printf("이메일: %s\n", rs.getString("email"));
    System.out.printf("암호: %s\n", rs.getString("password"));
    System.out.printf("사진: %s\n", rs.getString("photo"));
    System.out.printf("전화: %s\n", rs.getString("tel"));
    System.out.printf("가입일: %s\n", rs.getDate("cdt"));

  }

} catch (Exception e) {
  System.out.println("오류!");
  e.printStackTrace();
}
  }
}
