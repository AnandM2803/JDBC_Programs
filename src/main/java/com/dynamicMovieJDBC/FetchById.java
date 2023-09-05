package com.dynamicMovieJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviejdbc","root","root");

PreparedStatement preparedStatement=connection.prepareStatement("select * from movie where Id=?");

Scanner sc=new Scanner(System.in);

System.out.println("Enetr the Id");
int Id=sc.nextInt();

preparedStatement.setInt(1, Id);

ResultSet resultSet=preparedStatement.executeQuery();

resultSet.next();

System.out.println("Id :- "+resultSet.getInt(1)+" "+"Movie Name :- "+resultSet.getString(2)+" "+"Ticket Price :- "+resultSet.getInt(3)+" "+"Theater Location :- "+resultSet.getString(4));

connection.close();

	}

}
