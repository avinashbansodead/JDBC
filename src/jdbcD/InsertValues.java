package jdbcD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues 
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	Statement st=con.createStatement();
	st.execute("insert into student(id,name,age)values(3,'mangesh',20),(4,'Sumit',10)");
	
	System.out.println("Values are insrted");
}
}

	
