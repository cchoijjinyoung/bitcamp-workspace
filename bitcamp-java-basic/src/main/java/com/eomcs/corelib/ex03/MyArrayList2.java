package com.eomcs.corelib.ex03;

public class MyArrayList2 {

  static Object[] arr = new Object[5];
  static int size; // 0;

  static public boolean add(Object e) {
    arr[size++] = e; //arr[1] = "aaa";
    return true;
  }

  static public void add(int index, Object e) {

  }

  static public Object get(int index) {
    if (index > size) {
      System.out.println("인덱스가 유효하지 않습니다.");
    }
    return arr[index];
  }

  }



