// 조건


package com.eomcs.basic.ex06;

public class Testt0110 {
  public static void main(String[] args) {
    int age = 65;

    if (age >= 19)
      System.out.println("성인입니다.");

    if (age >= 65)
      System.out.println("노인연금 수령 대상자입니다.");

    System.out.println("-----------------------");

    int gender = 1;

    if (gender == 1) {
      System.out.println("여성!");
      System.out.println("-----");
    } else {
      System.out.println("남성!");
      System.out.println("-----");
    }

    System.out.println("-----------------------");

    int age2 = 17;

    if (age2 >= 19)
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    else
      System.out.println("ok");

    System.out.println("-----------------------");

    int age3 = 5;

    if (age3 < 8)
      System.out.println("아동!");
    else
      if (age3 < 14)
        System.out.println("어린이!");
      else
        if (age3 < 19)
          System.out.println("청소년!");
        else
          if (age3 < 65)
            System.out.println("성인!");
          else
            System.out.println("노인!");

    int age4 = 5;

    if (age4 < 8)
      System.out.println("아동!");
    else if (age4 < 14)
      System.out.println("어린이!");
    else if (age4 < 19)
      System.out.println("청소년!");
    else if (age4 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");

    System.out.println("-----------------------");

    age4 = 22;

    if (age4 < 8) {
      System.out.println("아동!");
    } else if (age4 < 14) {
      System.out.println("어린이!");
    } else if (age4 < 19) {
      System.out.println("청소년!");
    } else if (age4 < 65) {
      System.out.println("성인!");
    } else {
      System.out.println("노인!");


  }
}
}



