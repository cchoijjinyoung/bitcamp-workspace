package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 명령 프롬프트를 출력한다
// 2) 명령어를 입력 받아 출력한다.
public class App_clear {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

      // 회원
      final int LENGTH = 100;
      int[] no = new int[LENGTH];
      String[] name = new String[LENGTH];
      String[] email = new String[LENGTH];
      String[] password = new String[LENGTH];
      String[] photo = new String[LENGTH];
      String[] tel = new String[LENGTH];
      Date[] now = new Date[LENGTH];
      long currentMillis = 0;
      int count = 0;

      // 프로젝트
      final int PLENGTH = 100;
      int[] pno = new int[PLENGTH];
      String[] ptitle = new String[PLENGTH];
      String[] pcontent = new String[PLENGTH];
      Date[] pstartDate = new Date[PLENGTH];
      Date[] pendDate = new Date[PLENGTH];
      String[] powner = new String[PLENGTH];
      String[] pmembers = new String[PLENGTH];
      int pcount = 0;

      loop:
      while (true) {
        System.out.print("명령> ");

        String command = keyInput.nextLine();


      switch (command.toLowerCase()) {

        case "/member/add":
          System.out.println("[회원 등록]");

          System.out.println("번호? ");
          no[count] = keyInput.nextInt();
          keyInput.nextLine();

          System.out.print("이름? ");
          name[count] = keyInput.nextLine();

          System.out.print("이메일? ");
          email[count] = keyInput.nextLine();

          System.out.print("암호? ");
          password[count] = keyInput.nextLine();

          System.out.print("사진? ");
          photo[count] = keyInput.nextLine();

          System.out.print("전화? ");
          tel[count] = keyInput.nextLine();

          currentMillis = System.currentTimeMillis(); //1970-1-1 00:00:00 에서 경과 된 밀리초
          now[count] = new Date(currentMillis);
          System.out.println();

          count++;
          break;


        case "/member/list":
          System.out.println("[회원 목록]");

          for (int i = 0; i < count; i++) {
            System.out.printf("%d, %s, %s, %s ,%s, %s\n",
                no[i], name[i], email[i], password[i], photo[i], tel[i]);
            }
            break;

        case "/project/add":
          System.out.println("[프로젝트 등록]");



          System.out.print("번호? ");
          pno[pcount] = keyInput.nextInt();
          keyInput.nextLine();

          System.out.print("프로젝트명? ");
          ptitle[pcount] = keyInput.nextLine();

          System.out.print("내용? ");
          pcontent[pcount]= keyInput.nextLine();

          System.out.print("시작일? "); //사용자가 입력한 문자열을 날짜로 받을 때에는 valueOf 사용.
          pstartDate[pcount] = Date.valueOf(keyInput.nextLine());

          System.out.print("종료일? ");
          pendDate[pcount] = Date.valueOf(keyInput.nextLine());

          System.out.print("만든이? ");
          powner[pcount] = keyInput.nextLine();

          System.out.print("팀원? ");
          pmembers[pcount]= keyInput.nextLine();


          pcount++;

          break;


        case "/project/list":
          System.out.println("[프로젝트 목록]");

          for (int i = 0; i < pcount; i++) {
            System.out.printf("%d, %s, %s, %s ,%s\n",
                pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
            }
            break;
        case "quit":
        case "exit":
          System.out.println("안녕!");
          break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
      }

    }
      keyInput.close();
      System.out.println("종료!");
    }
  }






    /*

static



    System.out.println("[회원]");

    inputMembers(); // 별도의 블록으로 분리한 코드를 실행하기

    System.out.println("------------------------------");

    printMembers();
    }

  static void inputMembers() {
    Scanner keyInput = new Scanner(System.in);
    long currentMillis = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {

      count++;
      Member m = new Member();





      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response= keyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; //반복문을 멈춰라.
      }
    }

  }
  static void printMembers() {

      Member m = members[i];

      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          m.no, m.name, m.email, m.password, m.photo, m.tel, m.now.toString());
    }
    */



