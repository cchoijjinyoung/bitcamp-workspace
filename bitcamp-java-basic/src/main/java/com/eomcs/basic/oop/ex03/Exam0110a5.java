package com.eomcs.basic.oop.ex03;


public class Exam0110a5 {

static class Student {
  static int count;
  String name;
  int age;
}

public static void main(String[] args) {
  Student.count = 0;

  Student s1 = new Student();
  s1.name = "ghdrlfehd";
  s1.age = 10;
  Student.count++;

  Student s2 = new Student();
  s2.name = "dlaRjrwjd";
  s2.age = 20;
  Student.count++;

  Student s3 = new Student();
  s3.name = "dbrhkstns";
  s3.age = 30;
  Student.count++;

  System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
  System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
  System.out.printf("%d, %s, %d\n", Student.count, s3.name, s3.age);

  System.out.println(s1.count);
  System.out.println(s2.count);
  System.out.println(s3.count);

}
  }







