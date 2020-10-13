package com.eomcs.corelib.ex03;

public class MyArrayListTest3 {

  public static void main(String[] args) {
    MyArrayList list1 = new MyArrayList();
    list1.add("aaa");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    list1.add("eee");
    list1.add("fff");
    list1.add("ggg");
    list1.remove(2);
    list1.remove(0);
    list1.remove(4);
    print2(list1);

    MyArrayList list2 = new MyArrayList();
    list2.add("fff");
    list2.add("ggg");
    list2.add("hh");
    list2.add("iii");
    list2.add("jjj");
    list2.add("kkk");

    list2.add("lll");


    print2(list2);

  }
  static void print(MyArrayList list) {

    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.printf(str + ",");
    }
    System.out.println();
  }

  static void print2(MyArrayList list) {
    Object[] arr = list.toArray();
    for (Object obj : arr) {
      System.out.printf((String) obj + ",");
    }
    System.out.println();
  }
}







