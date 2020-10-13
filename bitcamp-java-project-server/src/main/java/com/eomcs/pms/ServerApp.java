package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.ServerSocket;

public class ServerApp {

    public static void main(String[] args) {
     try (ServerSocket ss = new ServerSocket(8888));
       PrintStream out = new PrintStream(getOutputStream());
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream());) {


     } catch (Exception e) {
       e.printStackTrace();
     }
    }
}
