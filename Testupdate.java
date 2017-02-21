package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testupdate {
	public void update(Connection con) throws SQLException
	{
		String q2="update employee set address='tirunelveli' where ename='vino'";
		PreparedStatement p2=con.prepareStatement(q2);
		int l=p2.executeUpdate();
		System.out.println("No of rows deleted "+l);

	}

}
