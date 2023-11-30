package com.kodnest.jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCWithMethods {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Basu@8618231822";
	private static final String CREATE_TABLE_QUERY = "CREATE TABLE EMPLOYEE(ID INT,NAME VARCHAR(20), SALLARY INT);";
	private static final String INSERT_QUERY = "INSERT INTO EMPLOYEE VALUES(100, 'Prakash',25000),(101,'Snehit',40000),(103,'Lohit',35000);";
	private static final String SELECT_QUERY = "SELECT * FROM EMPLOYEE;";
	private static final String UPDATE_QUERY = "UPDATE EMPLOYEE SET SALLARY=35000 WHERE SALLARY=25000;";
	private static final String DELETE_QUERY = "DELETE FROM EMPLOYEE;";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		try {
			//1. Load and register
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Establish Connection to DB
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			//3. Create statement object
			Statement stmt = con.createStatement();
			
			boolean user_interest = true;
			while(user_interest) {
				System.out.println("Do you want to run this JDBC CRUD Application?(Yes/No)");
				String input = scan.next();
				if (input.equals("Yes")|| input.equals("yes")) {
					System.out.println("Please follow information given below");
					System.out.println("1 -> Insert Query");
					System.out.println("2 -> Select Query");
					System.out.println("3 -> Update Query");
					System.out.println("4 -> Delete Query");
					System.out.println("Enter your option: ");
					int option = scan.nextInt();
					
					switch(option) {
					case 1:
						createData(stmt, INSERT_QUERY);
						break;
					case 2:
						readData(stmt, SELECT_QUERY);
						//4. send and execute query
						ResultSet res = stmt.executeQuery(SELECT_QUERY);
						while(res.next()) {
							System.out.println("ID="+res.getInt(1)+" Name="+res.getString(2)+" Salary="+res.getInt(3));
						}
						break;
					case 3:
						updateData(stmt, UPDATE_QUERY);
						break;
					case 4:
						deleteData(stmt, DELETE_QUERY);
						break;
					default:
						System.out.println("Enter the valid input");
					}
				}else{
					System.out.println("Give valid input or Application ended by user..!!");
					user_interest = false;
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}



	//create table
	public static void createTable(Statement stmt) {
		try {
			stmt.execute("CREATE TABLE EMPLOYEE(ID INT,NAME VARCHAR(20), SALLARY INT);");
			System.out.println("Table Created Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//create / Insert
	public static void createData(Statement stmt, String insertQuery) {
		try {
			int rowsAffected = stmt.executeUpdate(insertQuery);
			System.out.println(rowsAffected+" rows affected.");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	//Read
	public static ResultSet readData(Statement stmt, String selectQuery) {
		ResultSet res = null;;
		try {
			res = stmt.executeQuery(selectQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	//Update
	public static void updateData(Statement stmt, String updateQuery) {
		try {
			int rowsAffected = stmt.executeUpdate(updateQuery);
			System.out.println(rowsAffected+" rows affected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//Delete
	public static void deleteData(Statement stmt, String deleteQuery) {
		try {
			int rowsAffected = stmt.executeUpdate(deleteQuery);
			System.out.println(rowsAffected+" rows affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
