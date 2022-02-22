package main.java;

import java.sql.*;

public class ListTable2 {

  public static void main(String[] args) throws Exception {

//    Registering the driver
    DriverManager.registerDriver(new org.postgresql.Driver());

//    Getting the connection
    String resource = "jdbc:postgresql://localhost:5432/";
    String dbName = "java_heroes";
    String user = "temporaryadmin";
    String password = "password";
    String url = resource + dbName;
    Connection conn = DriverManager.getConnection(url, user, password);
    System.out.println("Connection established ........");

//    Creating Statement object
    Statement stmt = conn.createStatement();

//    Retrieving the data
    ResultSet rs = stmt.executeQuery("SELECT * FROM pg_catalog.pg_tables");
    System.out.println("List all tables in " + dbName);
    while (rs.next()) {
      System.out.println(rs.getString(2));
      System.out.println();
    }
  }
}
