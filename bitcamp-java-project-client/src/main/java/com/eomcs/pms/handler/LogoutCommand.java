package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

public class LogoutCommand implements Command {

  @Override
  public void execute(Map<String,Object> context) {
    Member loginUser = (Member) context.get("loginUser");
    if (loginUser == null) {
      System.out.println("로그인 하지 않았습니다!");
      return;
    }
    System.out.printf("%s님 안녕히 가세요!", loginUser.getName());
    context.remove("loginUser");
  }
}
