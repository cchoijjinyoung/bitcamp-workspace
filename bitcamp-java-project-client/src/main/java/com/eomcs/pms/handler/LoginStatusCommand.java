package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.dao.MemberDao;

// Command 규칙에 따라 클래스를 정의한다.
public class LoginStatusCommand implements Command {

  MemberDao memberDao;

  public LoginStatusCommand(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void execute(Map<String,Object> context) {
    Member member = memberDao.
    System.out.println("안녕하세요!");
  }
}
