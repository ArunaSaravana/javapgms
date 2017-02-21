package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class libdelete {
	public void delete(Connection con) throws SQLException
	{
		String q1="delete from library where bid=?";
		String q2="delete from library where bid=?";
		PreparedStatement p1=con.prepareStatement(q1);
		PreparedStatement p2=con.prepareStatement(q2);
		p1.setInt(1, 2);
		p2.setInt(2,3);
		int j=p1.executeUpdate();
		int k=p1.executeUpdate();
		System.out.println(j+"" +k);
	}
	
		
	
}
