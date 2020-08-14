// indexOf()에서 객체를 찾을 때 equals()로 비교한다.
package com.eomcs.corelib.ex03;

public class MyArrayList02 {
  public static void main(String[] args) {
    MyArrayList.add("aaa");
    MyArrayList.add("bbb");
    MyArrayList.add("ccc");
    MyArrayList.add("ddd");
    MyArrayList.add("eee");

    print();
  }
static void print() {
    for (int i = 0; i < MyArrayList.size; i++ ) {
      String str = (String).MyArrayList.get(i);
      System.out.println(str + ",");
    }
  }
//  Object[] elementData = new Object[5];
//
//  int size;

}


