package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://13.126.20.163:3306/activity","root","Asdf@123");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
