package com.studentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from student");
		while (resultset.next()) {
			System.out.println("ID :- " + resultset.getInt(1) + " " + " ,Name :- " + resultset.getString(2) + " "
					+ " ,Kannada_Marks :- " + resultset.getInt(3) + " " + " ,Phone_Number :- " + resultset.getInt(4)
					+ " " + " ,Address :- " + resultset.getString(5) + " " + " ,Blood_Group :- "
					+ resultset.getString(6));

		}
		connection.close();
	}

}
