package com.eomcs.basic.ex05;

// 비트 연산자 & 활용 : 픽셀에서 파란색의 값을 강화시키고 싶다.

public class Test0460 {
 public static void main(String[] args) {
   
   boolean c, cpp, java, js, python, php, html, css;
   c = true;
   cpp = false;
   java = true;
   js = false;
   python = true;
   php = false;
   html = true;
   css = false;
   
   boolean[] lang = new boolean[8];
   
   lang[0] = true;
   lang[1] = false;
   lang[2] = true;
   lang[3] = false;
   lang[4] = true;
   lang[5] = false;
   lang[6] = true;
   lang[7] = false;
   
   int lang2 = 0;
   
   lang2 |= 0x80;
   lang2 |= 0x20;
   lang2 |= 0x08;
   lang2 |= 0x02;
   
   
   
   
   

   

  }
}