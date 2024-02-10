package jdbcD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchValueDynamically
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	PreparedStatement ps=con.prepareStatement("select * from student where id=?");

	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
		
		
	}
}
}







