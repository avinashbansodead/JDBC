package jdbcD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class LoginValidation1
{
	public static void main(String[]args)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Deccan","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Account(id,name,email,password,PhoneNo)values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Email");
			String email=sc.next();
			System.out.println("Enter password");
			String password=sc.next();
			System.out.println("Enter PhoneNo");
			String PhoneNo=sc.next();
			
			
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.setString(5,PhoneNo);
			
			
		//ps.execute()
			System.out.println("-----data inserted----");
			
			
		}
	}
	}




