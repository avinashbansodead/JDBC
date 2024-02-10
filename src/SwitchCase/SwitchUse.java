package SwitchCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SwitchUse
{

	public static void main(String[] args)throws ClassNotFoundException,SQLException 
	{

		
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Deccan", "root", "root");
			Statement st = con.createStatement();
			
			
//			st.execute("create table User(id int, name varchar(20), email varchar(30) , password varchar(20) )");
//			System.out.println("Table is Created");
			
			for (int i = 0; i == 0; ) 
			{
				System.out.println("1. Insert");
				System.out.println("2. update");
				System.out.println("3. delete");
				System.out.println("4. fetch");
				System.out.println("5. logout");
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the option : ");
				int opt = sc.nextInt();
				switch (opt) 
				{
				case 1:
					PreparedStatement insert = con
							.prepareStatement("insert into Asm(id,name,address,mobile) values(?,?,?,?)");

					System.out.print("Enter the id : ");
					int id = sc.nextInt();

					System.out.print("Enter the Name : ");
					String name = sc.next();

					System.out.print("Enter the address: ");
					String address = sc.next();

					System.out.print("Enter the mobile: ");
					String mobile= sc.next();

					insert.setInt(1, id);
					insert.setString(2, name);
					insert.setString(3, address);
					insert.setString(4, mobile);

					insert.execute();

					System.out.println("---Row inserted---");
					break;

				case 2:
					PreparedStatement update = con.prepareStatement("update Asm set name = ? where id = ?");

					System.out.print("Enter the Name : ");
					String updateName = sc.next();

					System.out.print("Enter the id : ");
					int FromId = sc.nextInt();

					update.setString(1, updateName);
					update.setInt(2, FromId);

					update.execute();

					System.out.println("---Row updated---");
					break;

				case 3:
					PreparedStatement delete = con.prepareStatement("delete from Asm where id = ?");

					System.out.print("Enter the id : ");
					int deleteId = sc.nextInt();

					delete.setInt(1, deleteId);

					delete.execute();

					System.out.println("---Row deleted---");
					break;

				case 4:
					PreparedStatement fetch = con.prepareStatement("select * from Asm where id = ?");

					System.out.print("Enter the id : ");
					int fetchId = sc.nextInt();

					fetch.setInt(1, fetchId);

					ResultSet rs = fetch.executeQuery();

					System.out.println("------------");

					while (rs.next()) 
					{
						System.out.println("Id : " + rs.getInt(1));
						System.out.println("Name : " + rs.getString(2));
						System.out.println("Email-Id : " + rs.getString(3));
						System.out.println("Password : " + rs.getString(4));

						System.out.println("------------");
					}

					break;

				case 5:
					i++;
					System.out.println("Logout Successfull");
					break;

				default:
					System.out.println("---Option did not match----");
					break;
				}
			}
			
			
			
			
	

		// TODO Auto-generated method stub

	}

}







