package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  static class Project {
    int pno;
    String ptitle;
    String pcontent;
    Date pstartDate;
    Date pendDate;
    String powner;
    String pmembers;
  }
  static final int LENGTH = 100;
  static Project[] list = new Project[LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("[프로젝트 등록]");

    Project p = new Project();

    p.pno = Prompt.inputInt("번호? ");
    p.ptitle = Prompt.inputString("프로젝트명? ");
    p.pcontent = Prompt.inputString("내용? ");
    p.pstartDate = Prompt.inputDate("시작일? ");
    p.pendDate = Prompt.inputDate("종료일? ");
    p.powner = Prompt.inputString("만든이? ");
    p.pmembers = Prompt.inputString("팀원? ");

    list[size++] =p;
  }

  public static void list() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < size; i++) {
      Project p = list[i];
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          p.pno, p.ptitle, p.pstartDate, p.pendDate, p.powner);
    }
  }
}
