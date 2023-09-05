package com.dynamicMovieJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableMovie {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviejdbc", "root", "root");

		Statement statement = connection.createStatement();

		statement.execute("create table movie(Id integer primary key,Mname varchar(10) not null,Mprice integer not null,Theaterloc varchar(15) not null)");

		System.out.println("Table is created");
		connection.close();
	}

}
