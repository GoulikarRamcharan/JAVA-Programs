package jdbc;

import java.sql.*;

public class Firstconnect {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		connection dbcon = new connection();
		
		Connection con = dbcon.getconnection();
		
		if (con != null) {
			System.out.println("Connection Successful");
		}
		else {
			System.out.println("Failed");
		}
		
		Statement st = con.createStatement();
		
		//question 1
		
//		String query = "select * from employee where emp_salary > 50000 ";
		
		//question 2 
		String query = "select * from employee where emp_salary = (select Max(emp_salary) from employee)";
		
		ResultSet rs =  st.executeQuery(query);
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+rs.getInt(3));
			
			
		}
	}

}
