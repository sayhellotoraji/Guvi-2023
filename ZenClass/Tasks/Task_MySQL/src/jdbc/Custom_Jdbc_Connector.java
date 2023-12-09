package jdbc;

import java.sql.*;

public class Custom_Jdbc_Connector {
	public static void main(String args[]) throws SQLException {
		Connection con = null;
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      con = DriverManager.getConnection(
		        "jdbc:mysql://127.0.0.1:3306/Task_MySQL_2",
		        "{Enter - Username}",
		        "{Enter - Password}"
		      );
		      
		      System.out.println("Connection established.\n");
		      Statement stmt = con.createStatement();
		      
		      
		      String record_1 = "INSERT INTO Employee VALUES(101, 'Jenny', 25, 10000)";
		      stmt.execute(record_1);
		      
		      String record_2 = "INSERT INTO Employee VALUES(102, 'Jacky', 30, 20000)";
		      stmt.execute(record_2);
		      
		      String record_3 = "INSERT INTO Employee VALUES(103, 'Joe', 20, 40000)";
		      stmt.execute(record_3);
		      
		      String record_4 = "INSERT INTO Employee VALUES(104, 'John', 40, 80000)";
		      stmt.execute(record_4);
		      
		      String record_5 = "INSERT INTO Employee VALUES(105, 'Shameer', 25, 90000)";
		      stmt.execute(record_5);
		      System.out.println("empcode\tempname\tempage\tempsalary");
		      ResultSet rs = stmt.executeQuery("select * from Employee");
		      while (rs.next()) System.out.println(
		        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + 
		        rs.getInt(3)+ "\t" + rs.getInt(4)
		      );
		      
		    } catch (Exception e) {
		      System.out.println(e);
		    }
			finally {
				con.close();
				System.out.println("\nConnection closed.");
			}
	}
	
}
