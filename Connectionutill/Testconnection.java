package Connectionutill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testconnection {
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("org.h2.Driver");
		Connection c=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		return c;
	}
}
