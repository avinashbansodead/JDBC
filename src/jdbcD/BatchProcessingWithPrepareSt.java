package jdbcD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessingWithPrepareSt
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider","root","root");
	PreparedStatement ps=con.prepareStatement("insert into studen(id,name,age)values(?,?,?)");

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Mobile Number");
		int age=sc.nextInt();
		System.out.println("Enter Id1");
		int id1=sc.nextInt();
		System.out.println("Enter Name1");
		String name1=sc.next();
		System.out.println("Enter Mobile Number1");
		int age1=sc.nextInt();
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3,age);
	    ps.addBatch();
		System.out.println("-----data inserted----");
		ps.setInt(1,id1);
		ps.setString(2,name1);
	ps.setInt(3,age1);
		ps.addBatch();
		ps.executeBatch();
		
		
	}
}
}







