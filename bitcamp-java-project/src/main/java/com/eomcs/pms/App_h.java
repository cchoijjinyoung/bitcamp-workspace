package com.eomcs.pms;

import java.sql.Date;

// 1) 회원의 정보를 담을 수 있는 메모리를 설계한다.
// 2) Member 클래스의 래퍼런스 배열을 만들어 Memberdml 인스턴스를 보관한다.
// 3) 래퍼런스 배열을 사용하여 인스턴스를 다루기 보다는
//      낱개의 래퍼런스를 만들어 인스턴스를 다루는 것이 더 간결하다.
public class App {

  public static void main(String[] args) {

    // 값을 담기 위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는지 설계도를 작성한다.
    // => 이것을 ' 클래스 정의' 라고 한다.
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date createdDate;
    }
    final int LENGTH = 5;
    Member[] members = new Member[LENGTH]; // [ , , , , ]


 Member m = new Member();
 System.out.print("번호");
 members[i].no = keyInput.nextInt();
 keyInput.nextLine();

//  new Member();

//    Scanner KeyInput = new Scanner(System.in);
//
//    System.out.println("[회원]");

  }

}
