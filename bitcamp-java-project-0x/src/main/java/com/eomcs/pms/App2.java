package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    // 여러 개의 프로젝트 정보를 입력 받기 위해 변수 준비
    final int LENGTH = 100;
    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    System.out.print("[프로젝트]");
    int count = 0;



    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      title[i] = keyInput.nextLine();

      System.out.print("내용? ");
      content[i]= keyInput.nextLine();

      System.out.print("시작일? "); //사용자가 입력한 문자열을 날짜로 받을 때에는 valueOf 사용.
      startDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[i]= keyInput.nextLine();

      System.out.println();

      System.out.println("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      count++;

      if (!response.equalsIgnoreCase("y")) {
        break;

      }


    }

    keyInput.close();

    System.out.println("----------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s ,%s\n",
          no[i], title[i], startDate[i], endDate[i], owner[i], members[i]);

    }


  }
}



