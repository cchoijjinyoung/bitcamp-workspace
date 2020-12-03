package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String email = "";
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals("email")) {
          email = cookie.getValue();
          break;
        }
      }
    }

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("  <html>");
    out.println("  <head>");
    out.println("  <meta charset'UTF-8'>");
    out.println(" <title>로그인</title>");
    out.println("  </head>");
    out.println("  <body>");
    out.println("  <h1>로그인</h1>");
    out.println("  <form action='login' method='post'>");
    out.printf("  이메일: <input type='email' name='email' value='%s'><br>", email);
    out.println("  암호: <input type='password' name='password'><br>");
    out.printf("  <input type='checkbox' name='saveEmail'>이메일 저장<br>");
    out.println("  <button>로그인</button>");
    out.println("  </form>");
    out.println("  </body>");
    out.println("  </html>");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 클라이언트 전용 보관소(세션)를 준비한다.
    HttpSession session = request.getSession();

    // 클라이언트로 데이터를 출력할 때 사용할 스트림 준비
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>로그인</title></head>");
    out.println("<body>");

    try {
      out.println("<h1>로그인</h1>");
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      Cookie emailCookie = new Cookie("email", email);

      if (request.getParameter("saveEmail") != null) {
        // 클라이언트에게 보낼 email 쿠키를 준비한다.
        // 로그인 폼에서만 사용할 것임. 사용범위 지정.
        // 사용범위를 지정하지 않으면 현재 URL에 정된다 => 지정 필요가 없음. /auth 까지를 의미한다.
        // 대신 웹브라우저를 종료하거나 컴퓨터를 종료한 후에 유지해야 하기 때문에 유효기간을 설정한다.
        emailCookie.setMaxAge(60 * 60 * 24 * 7);
      } else {
        emailCookie.setMaxAge(0);
      }
      response.addCookie(emailCookie);

      if (session.getAttribute("loginUser") != null) {
        out.println("<p>로그인 된 상태입니다.</p>");

      } else {
        // 클라이언트가 보낸 데이터를 꺼낸다.
        // 서블릿이 로그인 작업에 사용할 도구를 준비한다.
        ServletContext ctx = request.getServletContext();
        MemberService memberService = (MemberService) ctx.getAttribute("memberService");

        Member member = memberService.get(email, password);
        if (member == null) {
          out.println("<p>사용자 정보가 맞지 않습니다.</p>");

        } else {
          // 로그인이 성공했으면 회원 정보를
          // 각 클라이언트의 전용 보관소인 session에 저장한다.
          session.setAttribute("loginUser", member);
          response.sendRedirect("../index.html");
          return;
//          request.getRequestDispatcher("/index.html").forward(request, response);
//          return;
        }
      }

    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error").forward(request, response);
      return;
    }

    out.println("</body>");
    out.println("</html>");

    response.setHeader("Refresh", "1;url=../index.html");
  }
}
