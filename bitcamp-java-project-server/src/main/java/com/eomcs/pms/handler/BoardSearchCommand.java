package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

public class BoardSearchCommand implements Command {
  BoardService boardService;

  public BoardSearchCommand(BoardService boardService) {
    this.boardService = boardService;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Map<String, Object> context) {
    try {
      out.println("[게시물 검색]");
      String keyword = Prompt.inputString("검색어? ", out, in);
      List<Board> list = boardService.list(keyword);

      if (list == null) {
        out.println("해당 검색어의 게시글이 없습니다.");
        return;
      }

      out.println("번호, 제목, 작성자, 등록일, 조회수");

      for (Board board : list) {
        out.printf("%d, %s, %s, %s, %d\n",
            board.getNo(),
            board.getTitle(),
            board.getWriter().getName(),
            board.getRegisteredDate(),
            board.getViewCount());
      }
} catch(Exception e) {
  e.printStackTrace();
}
  }
}
