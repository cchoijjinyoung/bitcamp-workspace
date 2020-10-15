package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.pms.listener.RequestMappingListener;

//Stateful
// 클라이언트 Quit 후 연결 끊어주기.

public class ServerApp {

  static boolean stop = false;

  static Map<String,Object> context = new Hashtable<>();
  List<ApplicationContextListener> listeners = new ArrayList<>();

  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }
  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }
  }

  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }
  public void service(int port) {

    notifyApplicationContextListenerOnServiceStarted();
    try (ServerSocket ss = new ServerSocket(port)) {
      System.out.println("서버 실행중..");

      while (true) {
        Socket clientSocket = ss.accept();

        if (stop) {
          break;
        }
        // 람다 문법 사용
        new Thread(() -> handleClient(clientSocket)).start();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    notifyApplicationContextListenerOnServiceStopped();
    }



    public static void main(String[] args) {
      ServerApp sa = new ServerApp();
      sa.addApplicationContextListener(new AppInitListener());
      sa.addApplicationContextListener(new DataHandlerListener());
      sa.addApplicationContextListener(new RequestMappingListener());
      sa.service(8888);
    }

    private static void handleClient(Socket clientSocket) {
      InetAddress address = clientSocket.getInetAddress();
      System.out.printf("클라이언트(%s)가 연결되었습니다.\n",
          address.getHostAddress());

      try (Socket socket = clientSocket; // try 블록을 떠날 때 close()가 자동 호출된다.
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

          String request = in.readLine();

          if (request.equalsIgnoreCase("stop")) {
            stop = true;
            out.println("서버를 종료하는 중입니다!");
            out.println();
            out.flush();
            return;
          }

          Command command = (Command) context.get(request);
          if (command != null) {
            command.execute(out, in);
          } else {
          out.println("해당 명령을 처리할 수 없습니다.");
          }
          out.println(); //응답의 끝을 알리는 빈 문자열을 보낸다.
          out.flush(); //flush 도 잊지말자.

      } catch (Exception e) {
        System.out.println("클라이언트와의 통신 오류!");
      }

      System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n",
          address.getHostAddress());
    }

    private static void sendResponse(PrintWriter out, String message) {
      out.println(message);
      out.println(); // 응답이 끝났음을 알리는 빈 줄을 보낸다.
      out.flush();
    }
  }


