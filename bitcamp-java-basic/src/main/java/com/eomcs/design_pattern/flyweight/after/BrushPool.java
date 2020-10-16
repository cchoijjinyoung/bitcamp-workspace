package com.eomcs.design_pattern.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BrushPool {
  Map<String, Brush> brushMap = new HashMap<>();

  // 브러쉬를 리턴하는 매서드
  public Brush getBrush(String pattern) {
    Brush brush = brushMap.get(pattern);
    if(brush == null) {
      System.out.printf("%s 브러시 생성\n", pattern);
      brush = new Brush(pattern);
      brushMap.put(pattern, brush);
    }
    return brush;
  }
}
