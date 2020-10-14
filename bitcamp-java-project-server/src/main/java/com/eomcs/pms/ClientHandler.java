package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientHandler implements Runnable {
  Socket socket;

  public ClientHandler(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    InetAddress address = this.socket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n", address.getHostAddress());

    try (Socket socket = this.socket;
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {


        while (true) {
          String request = in.readLine();
          sendResponse(out, request);
          System.out.println(request);
          if (request.equalsIgnoreCase("quit"))
            break;
        }
    } catch (Exception e) {
      System.out.println("클라이언트와의 통신 오류!");
    }
    System.out.printf("클라이언트(%s)와 연결을 끊었습니다.\n", address.getHostAddress());
  }
  private void sendResponse(PrintStream out, String message) {
    out.println(message);
    out.println(); // 응답이 끝은 빈줄로 알린다.
    out.flush();
  }
  }

