package com.dynamicMovieJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviejdbc","root","root");

PreparedStatement preparedStatement=connection.prepareStatement("insert into movie values(?,?,?,?)");

Scanner sc=new Scanner(System.in);

System.out.println("Enter the ID");
int Id=sc.nextInt();
sc.nextLine();
System.out.println("Enter the movie Name");
String Mname=sc.nextLine();
System.out.println("Enter the Ticket Price");
int Mprice=sc.nextInt();
System.out.println("Enter teh Theater Location");
sc.nextLine();
String Theaterloc=sc.nextLine();
preparedStatement.setInt(1, Id);
preparedStatement.setString(2, Mname);
preparedStatement.setInt(3, Mprice);
preparedStatement.setString(4, Theaterloc);

preparedStatement.execute();
System.out.println("Values are inserted");

connection.close();
	}

}
