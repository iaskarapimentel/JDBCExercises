package main.java;

import java.sql.*;
import java.util.List;

public class ListSchemas {

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
    ResultSet rs = stmt.executeQuery("SELECT schema_name FROM information_schema.schemata");
    System.out.println("List of schemas");
    while (rs.next()) {
      System.out.println(rs.getString(1));
      System.out.println();
    }
  }
}