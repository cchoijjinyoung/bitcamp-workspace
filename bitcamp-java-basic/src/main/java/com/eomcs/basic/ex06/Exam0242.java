package com.eomcs.basic.ex06;

public class Exam0242 {
  enum Level {
    GUEST, MEMBER, ADMIN
  }
  public static void main(String[] args) {
    Level level = Level.MEMBER;

    final int GUEST = 0, MEMBER = 1, ADMIN = 2;

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
      case MEMBER:
        System.out.println("글작성 가능합니다.");
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }
  }
}



