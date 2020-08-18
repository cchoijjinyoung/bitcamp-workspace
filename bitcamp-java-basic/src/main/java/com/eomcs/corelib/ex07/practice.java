// java.util.HashSet 클래스 사용 - 중복저장 불가 테스트
package com.eomcs.corelib.ex07;

import java.util.HashSet;

public class practice {
 static class Member {
   String name;
   int age;

   public Member(String name, int age) {
     this.name = name;
     this.age = age;
   }

   @Override
   public String toString() {
     return "Member" + name + "age" + age;
   }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Member other = (Member) obj;
    if (age != other.age)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

 }
 public static void main(String[] args) {
  Member v1 = new Member("ghd", 20);

}
 static void print(HashSet set) {
   Object[] values = set.toArray();
   for (Object value : values) {
     System.out.println(value);
   }
 }
  }



