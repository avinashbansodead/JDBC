package jdbcD;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginValidation
{
	public static void main(String[]args)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Deccan","root","root");
		Statement st=con.createStatement();
		st.execute("create table Account(id int,name varchar(20),email varchar(30),password varchar(10),PhoneNo long)");
		
		System.out.println("Table created");
	}
	}




