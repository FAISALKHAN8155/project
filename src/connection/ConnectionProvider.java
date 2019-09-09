package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	public static Connection con=null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("org.h2.Driver");
			con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	
	}
	

}