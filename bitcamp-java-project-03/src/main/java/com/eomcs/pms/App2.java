package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    

    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");

    System.out.print("번호? ");
    String no = keyInput.nextLine();
    
    
    System.out.print("프로젝트명? ");
    String title = keyInput.nextLine();
    
    

    System.out.print("내용? ");
    String content = keyInput.nextLine();
    
    

    System.out.print("시작일? "); //사용자가 입력한 문자열을 날짜로 받을 때에는 valueOf 사용.
    java.sql.Date startDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    
    
    System.out.print("종료일? ");
    java.sql.Date endDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    
    

    System.out.print("만든이? ");
    String maker = keyInput.nextLine();
    
    
    System.out.print("팀원? ");
    String teamp = keyInput.nextLine();
    
    
    
    keyInput.close();
    System.out.println("----------------------------");
    System.out.println("번호: "+ no);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", startDate);
    System.out.printf("종료일: %s\n", endDate);
    System.out.printf("만든이: %s\n", maker);
    System.out.printf("팀원: %s, %s\n", maker,teamp);
    
    
    
        
  }
}
