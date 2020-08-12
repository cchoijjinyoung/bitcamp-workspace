//# 캡슐화 문법 사용 후 - 캡슐화와 게터/세터
package com.eomcs.oop.ex07.a;

class Score55 {

private String name;
private int kor;
private int eng;
private int math;
private int sum;
private float aver;

public void setName(String name) {
  this.name = name;
}

public String getName() {
  return this.name;
}

public void setKor(int kor) {
  this.kor = kor;
  this.compute();

}

public int getKor() {
  return this.kor;
}

public void setEng(int eng) {
  this.eng = eng;
  this.compute();
}

public int getEng() {
  return this.eng;
}

public void setMath(int math) {
  this.math = math;
  this.compute();
}

public int getMath() {
  return this.math;
}

public int getSum() {
  return this.sum;
}

public float getAver() {
  return this.aver;
}
void compute() {
  this.sum = this.kor + this.eng + this.math;
  this.aver = this.sum / 3f;
}
}

public class Exam311 {
  public static void main(String[] args) {

    Score55 s1 = new Score55();

    s1.setName("ghdrlfehd");
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(80);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.getName(), s1.getKor(), s1.getEng(), s1.getMath(), s1.getSum(), s1.getAver());





}
}




