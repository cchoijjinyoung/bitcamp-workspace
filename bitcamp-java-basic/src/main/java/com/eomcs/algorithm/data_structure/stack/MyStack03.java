package com.eomcs.algorithm.data_structure.stack;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyStack03 extends MyLinkedList {

  public Object push(Object item) {
    add(0, item);
    return item;

  }
}
