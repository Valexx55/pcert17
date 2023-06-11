package jcp17.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bd {
	
	public static void main(String[] args) throws SQLException {
		
		Statement stmt = null;
		Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
		try(stmt;)
		{
			
		}
	}

}
