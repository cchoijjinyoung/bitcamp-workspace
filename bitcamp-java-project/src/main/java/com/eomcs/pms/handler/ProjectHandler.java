package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {
  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }

  static final int LENGTH = 100;
  Project[] list = new Project[LENGTH];
  int size = 0;

  MemberHandler memberHandler;

  public ProjectHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  //인스턴스에 변수들을 유효한 값으로 초기화시키는 생성자를 정의한다.


  public void add() {

    System.out.println("[프로젝트 등록]");

    Project p = new Project();

    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");

    while (true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        p.owner = name;
        break;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder names = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원?(완료: 빈 문자열) ");

      if (name.length() == 0) {
        break;
      } else if (memberHandler.findByName(name) != null) {
        if (names.length() > 0) {
          names.append(",");
        }
        names.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    p.members = names.toString();

    list[size++] = p;

    // MemberHandler 의 인스턴스 필드가 보호되지 않기 때문에 외부로부터의 접근을
    // 다음과 같이 임의의 값으로 변경될 수 있다.
    // => 이러한 변경은 의존 객체를 사용하는 다른 쪽도 영향을 받을 수 있다.
    // memberHandler.size = 0;
    // 위와 같은 무효한 값으로 변경하는 것을 막지 못한다면?
    // 코드 작성한 의도와 다르게 동작할 수 있다.
  }

  public void list() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < size; i++) {
      Project p = list[i];
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner, p.members);
    }
  }
}
