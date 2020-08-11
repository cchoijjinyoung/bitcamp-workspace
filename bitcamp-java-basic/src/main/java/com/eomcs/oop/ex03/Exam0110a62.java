package com.eomcs.basic.oop.ex03;


public class Exam0110a62 {

static class Member {

  public static final int GUEST = 0;
  public static final int MEMBER = 1;
  public static final int MANAGER = 2;
  String id;
  String password;
  int type;
}

public static void main(String[] args) {


  Member m1 = new Member();
  m1.id = "aaa";
  m1.password = "1111";
  m1.type = Member.GUEST;

  Member m2 = new Member();
  m2.id = "bbb";
  m2.password = "2222";
  m2.type = Member.MEMBER;

}
  }







