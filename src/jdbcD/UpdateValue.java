package jdbcD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValue 
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	Statement st=con.createStatement();
	st.execute("insert into Student(id,name,age)values(500,'mangesh',20),(600,'Sumit',10)");

	int i=st.executeUpdate("update Student set name='Krishna' where id=500");
	
	System.out.println(i);
	System.out.println("Values are Updateds");

	
}
}



