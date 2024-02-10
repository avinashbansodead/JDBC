package jdbcD;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection1
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement st=con.createStatement();
	st.execute("create database spider");
	System.out.println("database created");
}
}
