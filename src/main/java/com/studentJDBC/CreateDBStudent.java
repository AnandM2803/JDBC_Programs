package com.studentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("create Database studentjdbc");
		System.out.println("Data Base is Created");
		connection.close();

	}
}
