package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//    - Node의 생성자를 추가한다.
public class MyLinkedList2 {

  Node first;
  Node last;
  int size;

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  static class Node {
    Object value;
    Node next;


  }
  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;
  }
}





