package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
@CommandAnno("/board/add")
public class BoardAddCommand extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    BoardService boardService = (BoardService)ctx.getAttribute("boardService");

      response.setContentType("text/plain;charset=UTF-8");

    PrintWriter out = response.getWriter();
    BufferedReader in = request.getReader();
    Map<String, Object> session = (Map<String, Object>) request.getSession();
    try {
      out.println("[게시물 등록]");

      Board board = new Board();
      board.setTitle(Prompt.inputString("제목? ", out, in));
      board.setContent(Prompt.inputString("내용? ", out, in));

      Member loginUser = (Member) session.get("loginUser");
      board.setWriter(loginUser);

      boardService.add(board);

      out.println("게시글을 등록하였습니다.");

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
