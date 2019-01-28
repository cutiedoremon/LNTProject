package Hello;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class BaseDAO{
	protected static Connection conn; //once
	
	static  {
		try {
			DriverManager.registerDriver( new OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public BaseDAO() {
		if(conn==null) {
			try {
				conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	}
	final public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}