package com.dynamicMovieJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviejdbc","root","root");

PreparedStatement preparedStatement=connection.prepareStatement("update movie set Mname=? where Id=?");

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Movie Name");
String Mname=sc.nextLine();
System.out.println("Enter the Id");
int Id=sc.nextInt();

preparedStatement.setString(1, Mname);
preparedStatement.setInt(2, Id);

preparedStatement.execute();
System.out.println("Values are updated");

connection.close();
	}

}
