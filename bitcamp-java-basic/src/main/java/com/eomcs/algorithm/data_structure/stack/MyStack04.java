package com.eomcs.algorithm.data_structure.stack;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 3) 스택에서 제일 마지막에 추가한 값을 꺼내는 pop() 매서드를 정의한다.
// 4) 스택에서 제일 마지막에 입력한 값을 조회하는 peek()을 정의한다.
public class MyStack04 extends MyLinkedList {

  public Object push(Object item) {
    add(item);
    return item;

  }

  public Object pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
      return remove(size() - 1);

}
  public Object peek() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }
}
