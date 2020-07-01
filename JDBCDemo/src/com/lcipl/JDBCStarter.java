package com.lcipl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCStarter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Step 1 :  Load & Register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step 2: Establishing the Connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
		//Step 3 : Create and Execute Query
		Statement stmt = conn.createStatement();
		
		//Step 4: Process the result
		ResultSet rs = stmt.executeQuery("select * from employee");
		System.out.println("EmpID \t Name \t  Age \t Address \t Salary");
		while(rs.next()) {
			System.out.println(rs.getInt("empid")+"\t"+rs.getString("empname")+"\t"+rs.getInt("empage")+"\t"+rs.getString("empaddress")+"\t"+rs.getDouble("salary"));
		}
		
		//step 5: closing resources
		rs.close();
		stmt.close();
		conn.close();
	}

}
