package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

	public Connection getconnection() throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		

		String url = "jdbc:mysql://localhost:3306/userdb";
		
		String user = "root";
		
		String pwd = "Ram@2105";
		
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		return con;
	}
}
