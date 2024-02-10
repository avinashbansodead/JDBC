package jdbcD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginValidation3 {
	public static void main(String[]args)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Deccan","root","root");
	
		PreparedStatement ps=con.prepareStatement("select* from Account where email=? and password=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter password");
		String password = sc.next();
	
		ps.setString(1,"email");	
		ps.setString(2,"password");
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("Invalid Crendential");
		}
	}
	}



