package com.eomcs.pms.filter;

import java.util.ArrayList;
import java.util.Map;
import com.eomcs.pms.handler.Request;

// 역할
// - 커멘드필터 구현체 관리 / 실행
// -
public class CommandFilterManager implements FilterChain {
  ArrayList<CommandFilter> filters = new ArrayList<>();
  int nextFilterIndex = 0;

  public void add(CommandFilter filter) {
    filters.add(filter);
  }

  // 필터 관리자에게 필터를 순서대로 실행시키기 전에
  // 먼저 필터의 인덱스를 0으로 설정한다.
  public void reset() {
    this.nextFilterIndex = 0;
  }

  // 각각의 필터에게 준비하라고 요청한다.
  public void init(Map<String, Object> context) throws Exception {
    for (CommandFilter filter : filters) {
      filter.init(context);
    }
  }

  public void destoy() {
    for (CommandFilter filter : filters) {
      filter.destroy();
    }
  }

  // 다음 순서에 필터를 실행시키는 일을 수행.
  @Override
  public void doFilter(Request request) throws Exception {
    if (nextFilterIndex >= filters.size()) {
      // 다음 필터가 없다.
      return;
    }

    // 보관소에서 해당 인덱스의 필터를 꺼낸다.
    CommandFilter nextFilter = filters.get(nextFilterIndex++);
    nextFilter.doFilter(request, this);
  }
}
