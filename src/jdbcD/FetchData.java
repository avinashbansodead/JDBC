package jdbcD;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData 
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	Statement st=con.createStatement();
	int rs=st.executeUpdate("select* from Student where id=1;");
	System.out.println(rs);
	/*System.out.println(rs.next());
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));*/

	
}
}
