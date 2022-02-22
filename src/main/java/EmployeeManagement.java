package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeManagement {
  public static void main(String[] args) throws SQLException {

    String url = "jdbc:postgresql://localhost:5432/exercise22fev";
    String user = "temporaryadmin";
    String password = "password";

    Connection myConn = null;
    Statement myStmt = null;

    try {
      // 1. Get a connection to database
      myConn = DriverManager.getConnection(url, user, password);

      // 2. Create a statement
      myStmt = myConn.createStatement();

      // 3. Execute SQL query
      String sql = "insert into employees " + " (lname, fname, email)"
          + " values ('Falon', 'Adam', 'adam.falon@dci.com')";
      myStmt.executeUpdate(sql);

      sql = "insert into employees " + " (lname, fname, email)"
          + " values ('Gold', 'Mary', 'mary.gold@dci.com')";
      myStmt.executeUpdate(sql);

      sql = "insert into employees " + " (lname, fname, email)"
          + " values ('Currie', 'Adam', 'adam.currie@dci.com')";
      myStmt.executeUpdate(sql);

      sql = "insert into employees " + " (lname, fname, email)"
          + " values ('Jhonson', 'Bryan', 'bryan.jhonson@dci.com')";
      myStmt.executeUpdate(sql);

      sql = "insert into employees " + " (lname, fname, email)"
          + " values ('Ritesh', 'Prasad', 'prasad.ritesh@dci.com')";
      myStmt.executeUpdate(sql);

      sql = "insert into employees " + " (lname, fname, email)"
          + " values ('Jhonson', 'Mary', 'mary.jhonson@dci.com')";
      myStmt.executeUpdate(sql);

      System.out.println("Insert complete.");
    } catch (Exception exc) {
      exc.printStackTrace();
    } finally {
      if (myStmt != null) {
        myStmt.close();
      }

      if (myConn != null) {
        myConn.close();
      }
    }
  }
}
