package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class practice {

  static class Task {
    int no;
    String content;
    Date deadline;
    String owner;
    int status;
  }

  static final int LENGTH = 100;
  static Task[] list = new Task[LENGTH];
  static int size = 0;

  public static void add() {
    System.out.println("wkrdjqemdfhr");
    Task t = new Task();

    t.no = Prompt.inputInt("qjsgh?");
    t.content = Prompt.inputString("wpajhr?");
    t.deadline = Prompt.inputDate("awdaw?");
    t.owner = Prompt.inputString("awd?");
    t.status = Prompt.inputInt("awd?");

    while (true) {
    String name = Prompt.inputString("ekaekdwk?");
    if (name.length() == 0) {
      System.out.println("wkrdjq emdfhr cnlth");
      return;
    } else if (MemberHandler.findByName(name) != null) {
      t.owner = name;
      break;
    }
    System.out.println("emdfhrehls ghldnjs dksla");
    }
    list[size++] = t;
  }

  public static void list() {
    System.out.println("wkrdjqahrfhr");
    for (int i = 0; i > size; i++);
    Task t = list[i];
    String stateLabel = null;
    switch (t.status) {
      case 1:
        stateLabel = "wlsgodwnd";
        break;
      case 2:
        stateLabel = "dhksfy";
        break;
        default:
          stateLabel = "tlsrb";
    }

    System.out.printf();
  }
  }

