package jdbcD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertValueDynamically
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	PreparedStatement ps=con.prepareStatement("insert into emp(id,name,mobilenumber)values(?,?,?)");

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Mobile Number");
		long mobilenumber=sc.nextLong();
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setLong(3,mobilenumber);
	//ps.execute()
		System.out.println("-----data inserted----");
		
		
	}
}
}






