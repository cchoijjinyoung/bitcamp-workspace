package com.eomcs.pms.handler;

// 사용자의 명령을 처리하는 객체에 대해 호출할 메서드 규칙을 정의 한다.
public interface Command {
  // 클라이언트 요청 처리와 관련된 객체들 간에
  // 데이터 교환을 위해 맵 객체를 파라미터로 추가한다.

  // => 향 후 커멘드 객체에게 전달할 파라미터가 추가될 가능성을 위해
  // Request 객체에 담아서 넘긴다.
  // 나중에 전달할 값이 늘어나더라도 execute 매서드는 변경할 필요가 없다.
  void execute(Request request);
}
