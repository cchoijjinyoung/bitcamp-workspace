// 클래스 정보 추출 - 클래스 이름 알아내기
package com.eomcs.reflect.ex02;

public class Exam01 {

  static class A {}

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("java.lang.String");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz.getSimpleName()); // String
    System.out.println(clazz.getName()); // java.lang.String
    System.out.println(clazz.getCanonicalName()); // java.lang.String
    System.out.println(clazz.getTypeName()); // java.lang.String


    // 중첩클래스
    System.out.println("----------------------------------------------------");
    Class<?> clazz2 = Class.forName("com.eomcs.reflect.ex02.Exam01$A");

    System.out.println(clazz2.getSimpleName()); // A
    System.out.println(clazz2.getName()); // com.eomcs.reflect.ex02.Exam01$A
    System.out.println(clazz2.getCanonicalName()); // com.eomcs.reflect.ex02.Exam01.A
    System.out.println(clazz2.getTypeName()); // com.eomcs.reflect.ex02.Exam01$A

    // 익명클래스
    System.out.println("----------------------------------------------------");
    Class<?> clazz3 = Class.forName("java.lang.String");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz3.getSimpleName()); // String
    System.out.println(clazz3.getName()); // java.lang.String
    System.out.println(clazz3.getCanonicalName()); // java.lang.String
    System.out.println(clazz3.getTypeName()); // java.lang.String
  }

}
