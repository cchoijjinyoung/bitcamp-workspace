package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

// 1) 회원 데이터를 입력하는 코드를 메서드로 분리한다.
// 2) 회원 데이터 목록을 출력하는 코드를 메서드로 분리한다.
// 3) 프로젝트 데이터를 입력하는 코드를 메서드로 분리한다.
// 4) 프로젝트 데이터 목록을 출력하는 코드를 메서드로 분리한다.
// 5) 작업 데이터를 입력하는 코드를 메서드로 분리한다.
// 6) 작업 데이터 목록을 출력하는 코드를 메서드로 분리한다.
// 7) 사용자로부터 입력 받는 코드를 메서드로 분리한다.
// 8) 프롬프트 제목을 파라미터로 받아 출력한다.
// 9) prompt()를 목적에 따라 더 세분화하여 분리한다.
public class App {

  public static void main(String[] args) {

    //  첫번째 게시판에서 다룰 변수를 준비한다.
    // Heap영역에 게시물 인스턴스를 보관할 배열을 Board[] 준비한다.
    // 게시글 갯수를 보관할 변수를 준비한다. size[]

    MemberHandler memberHandler = new MemberHandler();
    // 다음과 같이 기본 생성자만 있는 경우는,
    // 해당 인스턴스를 생성하고 초기화시킬 때 외부에서 값을 받을 필요가 없다는 의미다.

    ProjectHandler projectHandler = new ProjectHandler(memberHandler);
    TaskHandler taskHandler = new TaskHandler(memberHandler);
    // ProjectHandler 를 생성할 때 필요로 하는 의존 객체를 전달한다.
    // => 이렇게 생성자를 적용하면,
    //    객체를 생성하는 개발자에게 인스턴스 사용에 필요한
    //    값이나 의존 객체 주입을 강제하는 효과가 있다.
    BoardHandler boardHandler = new BoardHandler();

    // 두번째 게시판에서 사용할 list, size 변수를 BoardHandler 설계도에 따라 Heap에 생성한다.
    BoardHandler boardHandler2 = new BoardHandler();
    BoardHandler boardHandler3 = new BoardHandler();
    BoardHandler boardHandler4 = new BoardHandler();
    BoardHandler boardHandler5 = new BoardHandler();
    BoardHandler boardHandler6 = new BoardHandler();

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add":
            memberHandler.add();
            break;
          case "/member/list":
            memberHandler.list();
            break;
          case "/project/add":
            projectHandler.add();
            break;
          case "/project/list":
            projectHandler.list();
            break;
          case "/task/add":
            taskHandler.add();
            break;
          case "/task/list":
            taskHandler.list();
            break;

          case "/board/add":
            boardHandler.add();
            break;
          case "/board/list":
            boardHandler.viewCount();
            boardHandler.list();
            break;
          case "/board2/add":
            boardHandler2.add();
            break;
          case "/board2/list":
            boardHandler2.viewCount();
            boardHandler2.list();
            break;
          case "/board3/add":
            boardHandler3.add();
            break;
          case "/board3/list":
            boardHandler3.viewCount();
            boardHandler3.list();
            break;
          case "/board4/add":
            boardHandler4.add();
            break;
          case "/board4/list":
            boardHandler4.viewCount();
            boardHandler4.list();
            break;
          case "/board5/add":
            boardHandler5.add();
            break;
          case "/boardH5/list":
            boardHandler5.viewCount();
            boardHandler5.list();
            break;
          case "/board6/add":
            boardHandler6.add();
            break;
          case "/board6/list":
            boardHandler6.viewCount();
            boardHandler6.list();
            break;

          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }

}
