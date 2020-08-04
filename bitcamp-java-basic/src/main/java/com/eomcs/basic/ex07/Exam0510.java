package com.eomcs.basic.ex07;

import java.util.Properties;

public class Exam0510 {

  // 실행하는 클래스는 다음과 같이 main() 매서드의 시그니처를 가져야한다.
  // 매서스 시그니처 == function prototype == 매서드선언
  // => 파라미터의 이름은 상관없다.

  public static void main(String[] args) {
    // 프로그램 아규먼트
    // > java Exam0510 aaaa bbbb cccc
    System.out.println(args.length);
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

    // JvM 아규먼트
    // > java -D이름=값 -D이름=값 Exam0510
    String s1 = System.getProperty("name");
    String s2 = System.getProperty("age");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println("----------------------------");

    // JVM의 전체 프로퍼티 목록
    // - JVM 의 기본 환경 변수
    Properties props = System.getProperties();
    Set keyList = props.keySet();

    for(Object key : keyList) {
      System.out.printf("%s ---> %s\n", key, System.getProperty((String)key));

    }
  }
  }


