// java.util.HashMap - 값을 저장할 때 key을 사용하여 저장한다.
package com.eomcs.corelib.ex08;

import java.util.HashMap;

public class practice {
  static class MyKey {
    String major;
    int no;

    public MyKey(String major, int no) {
    this.major = major;
    this.no = no;
  }
  @Override
  public String toString() {
    return "major" + major + " no" + no;

  }

}

public static void main(String[] args) {
  Member v1 = new Member("ghd", 20);
  Member v2 = new Member("dla", 20);
  Member v3 = new Member("db", 20);
  Member v4 = new Member("dks", 20);
  Member v5 = new Member("dbs", 20);

  MyKey k1 = new MyKey("컴공", 1);
  MyKey k2 = new MyKey("컴공", 2);
  MyKey k3 = new MyKey("컴공", 3);
  MyKey k4 = new MyKey("컴공", 4);
  MyKey k5 = new MyKey("컴공", 5);

  HashMap map = new HashMap();

  map.put(k1, v1);


}






