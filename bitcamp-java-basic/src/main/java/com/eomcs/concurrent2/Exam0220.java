package com.eomcs.concurrent2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0220 {

  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }
    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행중...\n",
            Thread.currentThread().getName());

        Thread.sleep(millisec);

        System.out.printf("%s 스레드 종료!\n",
            Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!",
            Thread.currentThread().getName());
      }
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(new MyRunnable(6000));
    executorService.execute(new MyRunnable(3000));
    executorService.execute(new MyRunnable(9000));
    executorService.execute(new MyRunnable(2000));

    Thread.sleep(3000);

    executorService.execute(new MyRunnable(4000));

    System.out.println("main() 종료!");
  }
}
