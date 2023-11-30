package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicQueryJDBCApp {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD= "Basu@8618231822";
	private static final String INSERT_QUERY = "INSERT INTO EMP1 VALUES(?,?,?);";
	private static final String SELECT_QUERY = "SELECT * FROM EMP1";
	private static final String UPDATE_QUERY = "UPDATE EMP1 SET SALARY=(SALARY+5000) WHERE ID=?";
	private static final String DELETE_QUERY = "DELETE FROM EMP1 WHERE ID=?";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		try {
			//1. Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2. Establish connection to DB
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			boolean quit = false;
			while(quit == false) {
				System.out.println("Choose appropriate option");
				System.out.println("1. INSERT DATA");
				System.out.println("2. READ DATA");
				System.out.println("3. UPDATE DATA");
				System.out.println("4. DELETE DATA");
				System.out.println("5. QUIT APPLICATION");
				int option = scan.nextInt();
				switch(option) {
				case 1:{
					createData(con, scan);
					break;
				}
				case 2:{
					readData(con, scan);
					break;
				}
				case 3:{
					updateData(con, scan);
					break;
				}
				case 4:{
					deleteData(con, scan);
					break;
				}
				case 5:{
					System.out.println("Application Ended");
					quit = true;
					break;
				}
				default:
					System.out.println("Invalid Option.");

				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void createData(Connection con, Scanner scan) {
		try {
			System.out.println("---RECORDS BEFORE INSERTING DATA---");
			readData(con, scan);
			System.out.println("Enter Employee ID to be Added= ");
			int id = scan.nextInt();
			System.out.println("Enter Employee Name to be Added= ");
			String name = scan.next();
			System.out.println("Enter Employee Salary to be Added= ");
			double salary = scan.nextDouble();
			
			PreparedStatement pstmt =  con.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected+" rows affected.");
			readData(con, scan);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void readData(Connection con, Scanner scan) {
		try {
			System.out.println("---CURRENT RECORDS---");
			PreparedStatement pstmt =  con.prepareStatement(SELECT_QUERY);
			ResultSet res =  pstmt.executeQuery();
			while(res.next()) {
				System.out.println("ID= "+res.getInt(1)+", NAME= "+res.getString(2)+", SALARY= "+res.getDouble(3));
			}
			System.out.println();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void updateData(Connection con, Scanner scan) {
		try {
			System.out.println("---RECORDS BEFORE UPDATING DATA---");
			readData(con, scan);
			System.out.println("Enter ID whose salary needs to be updated:");
			int id = scan.nextInt();
			PreparedStatement pstmt =  con.prepareStatement(UPDATE_QUERY);
			pstmt.setDouble(1, id);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected+" rows affected.");
			readData(con, scan);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteData(Connection con, Scanner scan) {
		try {
			System.out.println("---RECORDS BEFORE DELETING DATA---");
			readData(con, scan);
			System.out.println("Entere ID for which all records needs to be deleted:");
			int id  = scan.nextInt();
			PreparedStatement pstmt =  con.prepareStatement(DELETE_QUERY);
			pstmt.setInt(1, id);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected+" rows affected.");
			System.out.println("---CURRENT RECORDS---");
			readData(con, scan);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
