package databaseconnection;
import java.sql.*;
import java.sql.Connection;  
import java.sql.DriverManager;  
public class databasecon {  
        public static void main(String args[]) throws ClassNotFoundException  
        {  
            String url;  
            Connection con = null;  
            try {  
                Class.forName("com.mysql.jdbc.Driver");  
            url="jdbc:mysql://localhost:3306/activity";  
                con = DriverManager.getConnection(url);  
                System.out.println("Connection created");  
                con.close();  
                System.out.println("Connection closed");  
                }  
                catch (Exception e) {  
                System.out.println(e.toString());  
            }  
    }  
}  
