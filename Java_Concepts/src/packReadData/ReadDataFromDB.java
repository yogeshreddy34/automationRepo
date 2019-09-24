package packReadData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadDataFromDB {
	
	public void readingDataFromDB() {
		
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:DBName","Username","password");  
			              
			PreparedStatement ps=con.prepareStatement("select username from loginTable");  
			ResultSet rs=ps.executeQuery();  
			rs.next();//now on 1st row  
			            String uname=rs.toString();  
			System.out.println(uname);          
				              
			  
			con.close();  
			              
			System.out.println("success");  
			}
		    catch (Exception e) {
		    	e.printStackTrace();  
		    	}  
			 
		
	}
	
	public static void main(String[] args) {
		ReadDataFromDB obj=new ReadDataFromDB();
		obj.readingDataFromDB();
	}

}
