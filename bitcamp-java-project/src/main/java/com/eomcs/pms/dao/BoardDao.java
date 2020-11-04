package com.eomcs.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;

public class BoardDao {

  public int insert(Board board) throws Exception {
  try (Connection con = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
      PreparedStatement stmt = con.prepareStatement(
          "insert into pms_board(title,content,writer) values(?,?,?)")) {

    stmt.setString(1, board.getTitle());
    stmt.setString(2, board.getContent());
    stmt.setInt(3, board.getWriter().getNo());
    return stmt.executeUpdate();
    }
  }

  public Board findByNo(int no) throws Exception {
    Board board = new Board();
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select b.no, b.title, b.content, b.cdt, b.vw_cnt,m.no owner_no, m.name"
                + " from pms_board b inner join pms_member m on b.writer=m.no"
                + " where b.no = ?")) {

      stmt.setInt(1, no);
      try (ResultSet rs = stmt.executeQuery()) {
        rs.next();
          board.setTitle(rs.getString("title"));
          board.setContent(rs.getString("content"));
          Member member = new Member();
          member.setNo(rs.getInt("owner_no"));
          member.setName(rs.getString("name"));
          board.setWriter(member);
          board.setRegisteredDate(rs.getDate("cdt"));
          board.setViewCount(rs.getInt("vw_cnt"));
          return board;
        }
      }
    }

  public int update(Board board) throws Exception {
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "update pms_board set title = ?, content = ? where no = ?")) {

      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContent());
      stmt.setInt(3, board.getNo());
      return stmt.executeUpdate();

    }
  }

  public int delete(int no) throws Exception {
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement("delete from pms_board where no=?")) {

      stmt.setInt(1, no);
      return stmt.executeUpdate();


    }
  }
  public int detail(int no) throws Exception {
    return 1;
  }
}

