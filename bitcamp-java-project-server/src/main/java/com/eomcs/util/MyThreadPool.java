package com.eomcs.util;

import java.util.ArrayList;
import java.util.List;

public class MyThreadPool {

  List<Worker> workers = new ArrayList<>();

  class Worker extends Thread {
    Runnable task;

    public void setTask(Runnable task) {
      this.task = task;

      synchronized (this) {
        this.notify();
      }
    }
    @Override
    public void run() {
      synchronized (this) {
        while (true) {
          try {
            System.out.printf("[%s] - thread waiting \n", this.getName());
            synchronized(this) {
              this.wait();
            }
            System.out.println("스레드 작업시작!\n");

        } catch (Exception e) {
          System.out.println("스레드 실행 중 오류발생!");
          break;
        }
          try {
            task.run();
            System.out.println("스레드 작업종료!");

          } catch (Exception e) {
            System.out.println("error");

          } finally {
            workers.add(this);
            System.out.println("threadpool");
          }
        }
     }
      }
    }
  }

  pubic void execute(Runnable task) {
    Worker t;
    if (worker.size() == 0) {
      t = new.Worker();
      ss
    }
  }










