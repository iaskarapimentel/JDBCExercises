package main.java;

import java.sql.*;

public class ListDatabase {

  public static void main(String[] args) throws Exception {

//    Registering the driver
    DriverManager.registerDriver(new org.postgresql.Driver());

//    Getting the connection
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "temporaryadmin";
    String password = "password";
  Connection conn = DriverManager.getConnection(url, user, password);
    System.out.println("Connection established ........");

//    Creating Statement object
    Statement stmt = conn.createStatement();

//    Retrieving the data
    ResultSet rs = stmt.executeQuery("SELECT datname FROM pg_database;");
    System.out.println("List of databases");
    while (rs.next()) {
      System.out.println(rs.getString(1));
      System.out.println();
    }
  }
}
