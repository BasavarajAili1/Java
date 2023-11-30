package com.kodnest.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatchProcessing {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Basu@8618231822";
	private static final String QUERY1 = "UPDATE TRAINER SET GENDER='MALE' WHERE ID!=5;";
	private static final String QUERY2 = "UPDATE TRAINER SET GENDER='FEMALE' WHERE ID=5;";
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			//1. Load and Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Establish Connection with DB
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			//3. Create Statement Object
			Statement stmt =  con.createStatement();
			
			// (A) Set Auto Commit as false
			con.setAutoCommit(false);
			
			// (B) Add tasks to the batch
			stmt.addBatch(QUERY1);
			stmt.addBatch(QUERY2);
			
			// (C) Execute batch
			int[] countOfRowsAffected = stmt.executeBatch();
			for(int count: countOfRowsAffected) {
				System.out.println(count+" rows affected");
			}
			
			// (D) Commit back
			con.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
