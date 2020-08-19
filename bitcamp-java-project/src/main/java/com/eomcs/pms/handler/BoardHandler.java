package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
//import com.eomcs.pms.handler.BoardList.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {


  static int viewCount = 0;

  BoardList boardList = new BoardList();
  public void add() {
    System.out.println("[새 게시글]");

    Board board = new Board();
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.owner = Prompt.inputString("작성자? ");
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());



   boardList.add(board);
    System.out.println("게시글을 등록하였습니다.");

  }

  public void list() {
    System.out.println("[게시글 목록]");
    Board[] boards = boardList.toArray();

    for (Board board : boards) {

     System.out.printf("%d, %s, %s, %s, %s\n", board.no, board.title, board.owner, board.registeredDate, viewCount);
    }
  }

    public static void viewCount() {

     viewCount = viewCount + 1;
    }
  }









