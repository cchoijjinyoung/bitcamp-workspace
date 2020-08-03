package com.eomcs.pms;

import java.util.Scanner;

// 1) 명령 프롬프트를 출력한다
// 2) 명령어를 입력 받아 출력한다.
public class Apptlfwjs2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int LENGTH = 100;
    String[] name = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    int count = 0;


      loop:
      while(true) {

        System.out.println("명령> ");
        String command = sc.nextLine();

        switch(command) {
          case "/member/add":
            System.out.println("[회원정보 입력]");

            System.out.println("이름? ");
            name[count] = sc.nextLine();

            System.out.println("사진? ");
            photo[count] = sc.nextLine();

            System.out.println("전화? ");
            tel[count] = sc.nextLine();

            count++;
            break;

          case "/member/list":
            System.out.println("회원정보 출력");
            for(int i = 0; i < count; i++) {
              System.out.printf("%s, %s, %s\n", name[i], photo[i], tel[i]);
            }
              break;

          default:
            System.out.println("잘못 입력하셨습니다.");
              break;
          case "quit" :
          case "exit" :
            System.out.println("ㅇㅋ 나감");
            break loop;
        }
      }

      sc.close();
      System.out.println("종료! ");


  }
}

