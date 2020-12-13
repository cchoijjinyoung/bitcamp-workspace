package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Member;
@Controller
public class LogoutController {
  @RequestMapping("/auth/logout")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/html;charset=UTF-8");
    HttpSession session = request.getSession();

    Member loginUser = (Member) session.getAttribute("loginUser");
    if (loginUser != null) {
      session.invalidate(); // 로그아웃을 요청한 클라이언트의 세션을 무효화시킨다.
    }
    
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("loginUser", loginUser);
    return "/auth/logout.jsp";
  }
}