package com.studentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbc", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute(
				"create table student(Id integer primary key,Name varchar(10) not null,KannadaMarks integer not null,Phone integer not null,Address varchar(15) not null,BloodGroup varchar(3) not null)");
		System.out.println("Table is created");
		connection.close();
	}

}
