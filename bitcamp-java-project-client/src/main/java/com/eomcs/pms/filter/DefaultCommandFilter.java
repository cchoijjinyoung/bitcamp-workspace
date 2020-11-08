package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.Request;

// 필터 역할
// - Command 객체를 찾아 실행한다.
public class DefaultCommandFilter implements CommandFilter {

  @SuppressWarnings("unchecked")
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    Map<String, Object> context = request.getContext();
    //  request 보관소에서 context 맵 객체를 꺼낸다.

    // context 맵에서 커멘드 객체가 들어있는 맵을 꺼낸다.
  Map<String, Object> commandMap = (Map<String, Object>) context.get("commandMap");

  // 사용자가 입력한 명령에 따라 커멘드 객체를 실행한다.
    Command command = (Command) commandMap.get(request.getCommandPath());
    if (command != null) {
      try {
          command.execute(context);
        // 실행 중 오류가 발생할 수 있는 코드는 try 블록 안에 둔다.
      } catch (Exception e) {
        // 오류가 발생하면 그 정보를 갖고 있는 객체의 클래스 이름을 출력한다.
        System.out.println("--------------------------------------------------------------");
        System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
        System.out.println("--------------------------------------------------------------");
      }
    } else {
      System.out.println("실행할 수 없는 명령입니다.");
    }

  }
}