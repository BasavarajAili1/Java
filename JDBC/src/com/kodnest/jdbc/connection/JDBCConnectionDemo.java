package com.kodnest.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "Basu@8618231822";
		String CREATE_STUDENT_QUERY = "CREATE TABLE Student3 (ID INT, NAME VARCHAR(20), MARKS INT);";
//		String INSERT_STUDENT_QUERY = "INSERT INTO Student3 VALUES(1, 'RAM', 100);";
//		String UPDATE_STUDENT_QUERY = "UPDATE Student3 SET NAME='Sita' WHERE NAME='RAM';";
		String DELETE_STUDENT_QUERY = "DELETE FROM Student3";
		try {
			//1. Load & Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// FQCN (Fully Qualified Class Name) - Canonical From
			System.out.println("Driver Loaded and Registered Successfully");
			
			//2. Establish the Connection with Database
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully "+con);
			
			//3. Create Statement Object
			Statement stmt = con.createStatement();
			
			//4. Send & Execute Query
//			stmt.execute(CREATE_STUDENT_QUERY);
//			System.out.println("--Student3 Table Created Successfully----");
			
			int rowsAffected = stmt.executeUpdate(DELETE_STUDENT_QUERY);
			System.out.println(rowsAffected+" Rows Affected.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("====> Driver Not Found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("====> Failed to Establish Connection!");
			e.printStackTrace();
		}
	}
}
