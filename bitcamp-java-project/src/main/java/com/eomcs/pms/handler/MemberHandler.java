package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class MemberHandler {

//회원 데이터
 static class Member {
   int no;
   String name;
   String email;
   String password;
   String photo;
   String tel;
   Date registeredDate;

 }
 static final int LENGTH = 100;
 static Member[] list = new Member[LENGTH]; // 인스턴스를 담을 래퍼런스 주소를 100개만들어랑.
 static int size; // 값을 안정해주면 알아서 0으로 초기화.  = 0;

 public static void add() {
    System.out.println("[회원 등록]");

    Member m = new Member();
    m.no = Prompt.inputInt("번호? ");
    m.name = Prompt.inputString("이름? ");
    m.email = Prompt.inputString("이메일? ");
    m.password = Prompt.inputString("암호? ");
    m.photo = Prompt.inputString("사진? ");
    m.tel = Prompt.inputString("전화? ");
    m.registeredDate = new java.sql.Date(System.currentTimeMillis());
    list[size++] = m; // 0번째 래퍼런스에 m주소를 넣어라.

  }

 public static void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < size; i++) {
      Member m = list[i];
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }


}
