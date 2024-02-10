package SwitchCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValu
{


public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Deccan","root","root");
	Statement st=con.createStatement();
	st.execute("insert into Asm( id,name,address,mobile)values(1,'Vishal','KarveNagar',9089765432),(2,'Shyam','Warje',7656432189),(3,'Sumit','Hingane',8976453212)");
	System.out.println("Table created");
}
}




