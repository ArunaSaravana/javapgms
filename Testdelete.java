package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testdelete {
	public void delete(Connection con) throws SQLException
	{
		String q3="delete from employee where address='madurai'";
		PreparedStatement p3=con.prepareStatement(q3);
		int k=p3.executeUpdate();
		System.out.println("No of rows deleted "+k);
	}

}
