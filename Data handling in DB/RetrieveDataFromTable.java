package chapter3;

import java.sql.*;

public class RetrieveDataFromTable {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nec","nec");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from customer where cid='c-2'");
			
			while(rs.next()) {
				
				String cust_id = rs.getString("cid");
				String cust_name = rs.getString("cname");
				String location = rs.getString("loc");
				String emailid = rs.getString("emailid");
				
				System.out.println("Customer ID : " + rs.getString("cid"));
				System.out.println("Customer Name : " + cust_name);
				System.out.println("Location : " + location);
				System.out.println("Email ID : " + emailid);
				
				System.out.println("********************************");
			}
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
