package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class BoardHandler2 {

  static class Board {
    int no;
    String title;
    String content;
    String owner;
    Date registeredDate;
    int viewCount;

  }

  static final int LENGTH = 100;
  static Board[] list = new Board[LENGTH];
  static int size = 0;
  static int viewCount = 0;

  public static void add() {
    System.out.println("[새 게시글]");
    Board b = new Board();

    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("제목? ");
    b.content = Prompt.inputString("내용? ");
    b.owner = Prompt.inputString("작성자? ");
    b.registeredDate = new java.sql.Date(System.currentTimeMillis());



    list[size++] = b;
    System.out.println("게시글을 등록하였습니다.");

  }

  public static void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < size; i++) {
     Board b = list[i];
     System.out.printf("%d, %s, %s, %s, %s\n", b.no, b.title, b.owner, b.registeredDate, viewCount);
    }
  }

    public static void viewCount() {

     viewCount = viewCount + 1;
    }
  }









