package com.eomcs.pms.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.service.ProjectService;

@WebServlet("/project/detail")
public class ProjectDetailCommand extends HttpServlet {
  private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    BufferedReader in = request.getReader();

    ServletContext ctx = request.getServletContext();
    ProjectService projectService =
        (ProjectService) ctx.getAttribute("projectService");

    // 웹주소에 동봉된 데이터(Query String: qs)를 읽는다.
    int no = Integer.parseInt(request.getParameter("no"));

    response.setContentType("text/html;charset=UTF-8");

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>프로젝트 상세 조회</title></head>");
    out.println("<body>");
    try {
      out.println("<h1>프로젝트 조회</h1>");

      Project project = projectService.get(no);

      if (project == null) {
        out.println("해당 번호의 프로젝트가 없습니다.");
        return;
      }

      out.printf("프로젝트명: %s\n", project.getTitle());
      out.printf("내용: %s\n", project.getContent());
      out.printf("기간: %s ~ %s\n",
          project.getStartDate(),
          project.getEndDate());
      out.printf("관리자: %s\n", project.getOwner().getName());
      out.print("팀원: ");
      project.getMembers().forEach(
          member -> out.print(member.getName() + " "));
      out.println();

      out.println("작업:");
      out.println("--------------------------------");

      List<Task> tasks = taskService.listByProject(no);

      out.println("번호, 작업내용, 마감일, 작업자, 상태");
      for (Task task : tasks) {
        String stateLabel = null;
        switch (task.getStatus()) {
          case 1:
            stateLabel = "진행중";
            break;
          case 2:
            stateLabel = "완료";
            break;
          default:
            stateLabel = "신규";
        }
        out.printf("%d, %s, %s, %s, %s\n",
            task.getNo(),
            task.getContent(),
            task.getDeadline(),
            task.getOwner().getName(),
            stateLabel);
      }

    } catch (Exception e) {
      out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());

      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));

      out.printf("<pre>%s</pre>\n", errOut.toString());
    }

    out.println("</body>");
    out.println("</html>");
  }
}
