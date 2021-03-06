package com.eomcs.oop.ex09.g;

public interface List {
  // 인터페이스도 static 메서드를 가질 수 있다.
  // => 특정 인스턴스에 종속되지 않고 작업하는 경우에 static 메서드로 정의한다.

  // 인터페이스는 디폴트 메서드를 가질 수 있다.
  // => 기존 프로젝트에 영향을 끼치지 않으면서 기존 규칙에
  // 새 메서드를 추가할 때 사용한다.
  void m2();
  //static 메서드나 default 메서드가 여러 개 있더라도
  // 그 메서드들은 이미 구현된 메서드이기 때문에 추상 메서드와 상관없다.
  // 따라서 이 인터페이스는 추상 메서드가 한 개다.
  // 즉 람다로 구현할 수 있다.
  //String m3();

  void m3();

}
