package com.eomcs.pms;

import java.util.Scanner;
import java util.Date;

public class App3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("[작업]");

    System.out.printf("프로젝트? ");
    project = sc.nextLine();

    System.out.printf("번호? ");
    String str= sc.nextLine();
    int no = Integer.parseInt(str);

    System.out.printf("내용? ");
    String content = sc.nextLine();

    System.out.printf("완료일? ");
    java.sql.Date completeDate = java.sql.Date.valueOf(sc.nextLine());


    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.printf("> ");
    String state = sc.nextLine();

    System.out.printf("담당자? ");
    String home = sc.nextLine();

    sc.close();

    System.out.println("----------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", completeDate.toString());
    System.out.printf("상태: ");

//    if (state.equals("0")) {
//      System.out.println("신규");
//    } else if (state.equals("1")) {
//      System.out.println("진행중");
//    } else  {
//      System.out.println("완료");
//    }
    switch (state) {
      case "0":
        System.out.println("신규");
        break;
      case "1":
        System.out.println("진행중");
        break;
      default:
        System.out.println("완료");

    }
    System.out.printf("담당자: %s\n", home);
    ㅇㅇ
  }
}
