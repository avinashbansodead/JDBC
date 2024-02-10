package jdbcD;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	Statement st=con.createStatement();
	int i=st.executeUpdate("create table student(id int,name varchar(20),age int)");
	System.out.println(i);
	System.out.println("database created");
}
}
