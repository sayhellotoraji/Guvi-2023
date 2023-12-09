package jdbc_connector;

import java.sql.*;

// Steps to create jdbc connection and insert data
public class Custom_Jdbc_Connector  {
	public static void main(String args[]) throws SQLException {
		Connection con = null;
		try {
			
			// Step 1 - Register the Driver
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      
		      // Step 2 - Establish connection to mysql server
		      con = DriverManager.getConnection(
		        "jdbc:mysql://127.0.0.1:3306/Task_MySQL_2",
		        "rajasekar-t",
		        "rajasekar@369"
		      );
		      
		      System.out.println("Connection established.\n");
		      
		      // Step 3 - Creates a Statement object for sending SQL statements to the database
		      Statement stmt = con.createStatement();
		      
		      
		      String record_1 = "INSERT INTO Employee VALUES(101, 'Jenny', 25, 10000)";
		      
		      // Step 4 - Execute method is used to run sql queries and returns boolean
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
		      
		      // executeQuery() - used to execute sql commands - returns tabular data
		      ResultSet rs = stmt.executeQuery("select * from Employee");
		      
		      while (rs.next()) System.out.println(
		        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + 
		        rs.getInt(3)+ "\t" + rs.getInt(4)
		      );
		      
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		
			// Step 5 - Close Connection
			finally {
				con.close();
				System.out.println("\nConnection closed.");
			}
	}
	
}