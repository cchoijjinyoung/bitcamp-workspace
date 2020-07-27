package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    
    // 콘솔에서 사용자의 입력을 처리하는 도구를 준비한다.
    // => 키보드 : System.in
    // => 입력에서 값을 읽는 도구 : Scanner
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    //이런것도 있따.//new java.io.BufferedInputStream(System.in);
                    //new java.io.DataInputStream(System.in);
    
    
    System.out.println("[회원]");
    System.out.print("번호? ");
    int no = keyInput.nextInt();
    keyInput.nextLine();
    
    
    System.out.print("이름? ");
    String name = keyInput.nextLine();
    
    System.out.print("이메일? ");
    String email = keyInput.nextLine();
    
    System.out.print("암호? ");
    String password = keyInput.nextLine();
    
    System.out.print("사진? ");
    String photo = keyInput.nextLine();
    
    System.out.print("전화? ");
    String tel = keyInput.nextLine();
    
    long currentMillis = System.currentTimeMillis(); //1970-1-1 00:00:00 에서 경과 된 밀리초     
    java.sql.Date now = new java.sql.Date(currentMillis);
    
    
    
    
    
    keyInput.close();
    
    System.out.println("-------------------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", now.toString());
    
    
  }
}
