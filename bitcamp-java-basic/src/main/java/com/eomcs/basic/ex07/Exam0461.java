
package com.eomcs.basic.ex07;

public class Exam0461 {

 static int sum(int value) {
   if (value == 1)
     return 1;

   long a1 = 100, a2 = 100, a3 = 100, a4 = 100;
   long a11 = 100, a12 = 100, a13 = 100, a14 = 100;
   long a111 = 100, a112 = 100, a113 = 100, a114 = 100;
   return value + sum(value - 1);

 }

 public static void main(String[] args) {

   System.out.println(sum(10000));
 }
  }






