
package com.eomcs.basic.ex07;

public class Exam0620 {


public static void main(String[] 변수명은상관없다) {
  String name = System.getProperty("name");
  String s1 = System.getProperty("kor");
  String s2 = System.getProperty("eng");
  String s3 = System.getProperty("math");

  if (name == null || s1 == null || s2 == null || s3 == null) {
    System.out.println("실행형식");
    return;

  }
  int kor = Integer.parseInt(s1);
  int eng = Integer.parseInt(s2);
  int math = Integer.parseInt(s3);

  int sum = kor + eng + math;


  System.out.printf("이름: %s\n", name);
  System.out.printf("총점 : %s\n", sum);
  System.out.printf("평균 : %s\n", sum / 3f);
}
  }






