package com.dynamicMovieJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviejdbc","root","root");

PreparedStatement preparedStatement=connection.prepareStatement("delete from movie where Id=?");

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Id");
int Id=sc.nextInt();

preparedStatement.setInt(1, Id);

preparedStatement.execute();

System.out.println("Data Deleted Successfully");
connection.close();

	}

}
