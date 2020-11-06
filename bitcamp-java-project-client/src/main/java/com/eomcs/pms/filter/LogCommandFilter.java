package com.eomcs.pms.filter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import com.eomcs.pms.handler.Request;

// 필터 역할 :
// - 로그인 하지 않은 경우 커멘ㄷ

public class LogCommandFilter implements CommandFilter {
  PrintWriter logOut;

  public LogCommandFilter(File file) throws Exception {
    logOut = new PrintWriter(new FileWriter(file));
  }

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    logOut.println(request.getCommandPath());
    logOut.flush();

    next.doFilter(request);
}

  @Override
  public void destroy() {
    logOut.close();
  }
}