package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class TaskHandler {

//작업 데이터
 static class Task {
   int tno;
   String tcontent;
   Date tdeadLine;
   String towner;
   int tstatus;

 }
 static final int LENGTH = 100;
 static Task[] list = new Task[LENGTH];
 static int size = 0;

 public static void add() {
   System.out.println("[작업 등록]");
   Task t = new Task();
   t.tno = Prompt.inputInt("번호? ");
   t.tcontent = Prompt.inputString("내용? ");
   t.tdeadLine = Prompt.inputDate("마감일? ");
   t.tstatus = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
   t.towner = Prompt.inputString("담당자? ");

   list[size++] = t;
 }

 public static void list() {
   System.out.println("[작업 목록]");

   for (int i = 0; i < size; i++) {
     Task t = list[i];
     String stateLabel = null;
     switch (t.tstatus) {
       case 1:
         stateLabel = "진행중";
         break;
       case 2:
         stateLabel = "완료";
         break;
       default:
         stateLabel = "신규";
     }
     // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
     System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
         t.tno, t.tcontent, t.tdeadLine, stateLabel, t.towner);
   }
 }
}
