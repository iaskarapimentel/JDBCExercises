package main.java;

import java.sql.*;
import java.util.List;

public class ListTables {

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

    DatabaseMetaData metaData = conn.getMetaData();
    String[] type = {"TABLE"};

//    Retrieving the columns in the database
    ResultSet tables = metaData.getTables(null, null ,"%", type);
    System.out.println("List of schemas");
    while (tables.next()) {
      System.out.println(tables.getString("TABLE_NAME"));
      System.out.println();
    }
  }
}