package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCPrparedStatement {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Basu@8618231822";
	
	private static final String INSERT_QUERY = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
	
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		Connection con = null;
		try {
			//1. Load and Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Establish the connection to DB
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			//3. Create statement object
			Statement stmt = con.createStatement();
			
			//4. Send and Execute Query
			System.out.println("Enter ID of Employee = ");
			int id = scan.nextInt();
			
			System.out.println("Enter name of Employee = ");
			String name = scan.next();
			
			System.out.println("Enter salary of Employee = ");
			double salary = scan.nextDouble();
			
			PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			pstmt.execute();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
