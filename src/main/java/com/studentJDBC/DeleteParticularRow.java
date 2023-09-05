package com.studentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteParticularRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc", "root", "root");

		Statement statement = connection.createStatement();

		statement.execute("delete from student where Id=6");
		System.out.println("Data Deleted Successfully");
		connection.close();
	}

}
