package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import com.eomcs.util.Prompt;

public class ClientApp {

    public static void main(String[] args) {
      if (args.length != 2) {
        System.out.println("프로그램 사용법");
        System.out.println("  java -cp ... ClientApp 서버주소 포트번호");
        System.exit(0);
      }

      boolean stop = false;
      // 서버 주소 localhost
      // 서버 포토 8888
      // 프로토콜이란 클 서간 주받형
      // 서버와 연결된 소켓을 생성.
      // 소켓을 통해 문자열을 입출력 할 수 있도록 스트림 객체를 준비한다.
      // 먼저 서버에 간단한 인사말을 보낸다.
      // 서버가 응답한 메시지를 출력한다.
      // 보내고 받고 조건문 반복문 만들자왷
      // 아규먼트를 통해 서버의 주소 / 포트번호를 입력 받는다.
      try (Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

        while (true) {
        String input = Prompt.inputString("명령> ");

        out.println(input);
        out.flush();

        receiveResponse(in);

        if (input.equalsIgnoreCase("quit")) {
          break;

        } else if (input.equalsIgnoreCase("stop")) {
          stop = true;
          break;
        }
      }

      } catch (Exception e) {
        e.printStackTrace();
      }
      if (stop) {
        try (Socket socket = new Socket(args[0], Integer.parseInt(args[1]))) {

        } catch (Exception e) {

        }
      }
    }
    private static void receiveResponse(BufferedReader in) throws Exception {
      while (true) {
        String response = in.readLine();
        if (response.length() == 0)
          break;
        System.out.println(response);
      }
    }
}
