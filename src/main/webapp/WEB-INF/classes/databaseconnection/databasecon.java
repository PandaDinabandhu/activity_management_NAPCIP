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
			con = DriverManager.getConnection("jdbc:mysql://172.31.39.91:3306/name","root","Asdf@123");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
