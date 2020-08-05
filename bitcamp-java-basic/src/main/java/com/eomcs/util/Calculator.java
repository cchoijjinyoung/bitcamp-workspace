package com.eomcs.util;

public class Calculator {

  public static int result = 0;

  public static void plus(int value) {
  this result += value;
  }
  public static void minus(int value) {
    result -= value;
  }

  public static void multiple(int value) {
    result *= value;
  }
  public static void divide(int value) {
    result /= value;
  }
}