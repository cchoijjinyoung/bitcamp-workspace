package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0141 {
  public static void main(String[] args) throws Exception {

    System.out.printf("jdbc.drivers=%s\n", System.getProperty("jdbc.drivers"));
    try {
      //Class.forName("org.mariadb.jdbc.Driver");
      //Class.forName("oracle.jdbc.driver.OracleDriver");
      //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");



      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);
      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);
      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
