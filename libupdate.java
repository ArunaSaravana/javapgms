package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class libupdate {
	public void update(Connection con) throws SQLException
	{
		String q2="update library set bpublish=? where amt=?";
		PreparedStatement p2=con.prepareStatement(q2);
		p2.setString(1, "microsoft");
		p2.setInt(2, 160);
		int l=p2.executeUpdate();
		System.out.println(l);
	}
}
