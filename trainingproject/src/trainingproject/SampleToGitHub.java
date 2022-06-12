package trainingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleToGitHub {
	
	public static void getDBResult() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","sys as sysdba","ora123");
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setString(1, "101");
		
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
			}
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(SQLException sql) {
			sql.printStackTrace();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		SampleToGitHub.getDBResult();
	}

}
