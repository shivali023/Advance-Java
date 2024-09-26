package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCAssign {

	public static void main(String[] args) {
		try {

			
			Class.forName("com.mysql.cj.jdbc.Driver");


			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivali", "root", "Shivalisharma0102!");

			Statement stmt = con.createStatement();

			stmt.executeUpdate("INSERT INTO PERSON VALUES (1,'Shivali', 'Sharma')");

			System.out.println("Record successfully added to Person table!");

			con.close();

			

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

		

			e.printStackTrace();

		}



	}





	}


