package com.kodnest.jdbcrevision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo1 {
	private static final String URL = "jdbc:mysql://localhost:3306/company";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Basu@8618231822";
	private static final String UPDATE_QUERY = "UPDATE EMPLOYEE SET EMPLOYEE_SALARY=EMPLOYEE_SALARY+(EMPLOYEE_SALARY*0.1) WHERE EMPLOYEE_ID=?;";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection established");
			
			PreparedStatement pstmt =  conn.prepareStatement(UPDATE_QUERY);
			System.out.println("Enter ID whose salary should be updated: ");
			int id = scan.nextInt();
			pstmt.setInt(1, id);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected+" rows affected.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
