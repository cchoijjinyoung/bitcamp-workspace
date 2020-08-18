package com.eomcs.algorithm.data_structure.stack;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyStack02 extends MyLinkedList {

  public Object push(Object item) {
    add(0, item);
    return item;

  }
}
