// Mybatis - 클래스 별명 지정하기
package com.eomcs.mybatis.ex01;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 패키지에 소속된 전체 클래스에 대해 별명을 자동으로 부여할 수 있다.
// => 단 별명은 클래스 이름이다.
// <typeAliases>
// <package name="com.eomcs.mybatis.ex01>
// </typeAliases>
//
// 그러면 이 별명을 어디에 사용하는가?
// => SQL 맵퍼 파일에서 클래스를 지정할 때 사용한다.
// <select id="selectBoard2" resultType="abc">
// select
// board_id as no,
// title,
// contents as content,
// created_date registeredDate,
// view_count viewCount
// from x_board
// </select>
//
public class Exam0220 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream( //
        "com/eomcs/mybatis/ex01/mybatis-config03.xml");
    SqlSessionFactory factory = //
        new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = factory.openSession();

    List<Board> list = sqlSession.selectList("BoardMapper.selectBoard");

    for (Board board : list) {
      System.out.printf("%d, %s, %s, %s, %d\n", //
          board.getNo(), //
          board.getTitle(), //
          board.getContent(), //
          board.getRegisteredDate(), //
          board.getViewCount());
    }

    sqlSession.close();
  }

}


