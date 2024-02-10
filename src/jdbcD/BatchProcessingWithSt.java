package jdbcD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class BatchProcessingWithSt
{
public static void main(String[]args)throws ClassNotFoundException,SQLException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Qspider","root","root");
	Statement st=con.createStatement();
	st.addBatch("create table studen(id int,name varchar(20),age int)");
	st.addBatch("insert into studen(id,name,age)values(1,'Vishal',23)");
	st.addBatch("insert into studen(id,name,age)values(2,'Sumit',23)");
	st.addBatch("insert into studen(id,name,age)values(3,'Rutvik',23)");
	st.addBatch("insert into studen(id,name,age)values(4,'Krishna',23)");
	st.addBatch("insert into studen(id,name,age)values(5,'Shaym',23)");
	st.addBatch("insert into studen(id,name,age)values(6,'Tushar',23)");
	
//	st.addBatch("delete from studen where id=1");
//	st.addBatch("delete from studen where id=2");
//	st.addBatch("delete from studen where id=3");
//	st.addBatch("delete from studen where id=4");
//	st.addBatch("delete from studen where id=5");
//	st.addBatch("delete from studen where id=6");
	
	st.executeBatch();
	
}
}

	
