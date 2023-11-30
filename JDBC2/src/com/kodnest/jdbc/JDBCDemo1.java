package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD  = "Basu@8618231822";
	//	private static final String CREATE_TRAINER_QUERY = ("CREATE TABLE TRAINER (ID INT, NAME VARCHAR(20));");
	//	private static final String INSERT_TRAINER_QUERY = ("INSERT INTO TRAINER VALUES(01, 'ARUN');");
	//	private static final String UPDATE_TRAINER_QUERY = ("UPDATE TRAINER SET NAME='PUNITH' WHERE ID = 1;");
	//	private static final String DELETE_TRAINER_QUERY = ("DELETE FROM TRAINER WHERE ID = 1;");
	private static final String SELECT_ALL_TRAINER_QUERY = ("SELECT * FROM TRAINER;");

	public static void main(String[] args) {

		Connection con = null;



		try {
			//1. Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2. Establish Connection with DB
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully.");

			//3. Create Statement Object
			Statement stmt = con.createStatement();

			//4. Send and Execute Query
			//			stmt.execute(CREATE_TRAINER_QUERY);
			//			System.out.println("Table Created Successfully.");

			//			int rowsAffected = stmt.executeUpdate(DELETE_TRAINER_QUERY);
			//			System.out.println(rowsAffected+" row affected.");
			
			ResultSet res = stmt.executeQuery(SELECT_ALL_TRAINER_QUERY);
			while(res.next()) {
				System.out.println("ID = "+res.getInt(1)+", NAME= "+res.getNString(2));	
			}



		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) {
					con.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
