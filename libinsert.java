package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class libinsert {
	public void insert(Connection con) throws SQLException
	{
		String q="insert into library(bname,pyear,bpublish,amt)values(?,?,?,?),(?,?,?,?),(?,?,?,?),(?,?,?,?),(?,?,?,?)";
		PreparedStatement p=con.prepareStatement(q);
		p.setString(1, "c++");
		p.setInt(2, 2002);
		p.setString(3, "amazon");
		p.setInt(4, 200);
		
		p.setString(5, "java");
		p.setInt(6, 2005);
		p.setString(7, "ms");
		p.setInt(8, 760);

		p.setString(9, "oracle");
		p.setInt(10, 2005);
		p.setString(11, "micro");
		p.setInt(12, 560);

		p.setString(13, "html");
		p.setInt(14, 2000);
		p.setString(15, "heritage");
		p.setInt(16, 160);

		p.setString(17, "sql");
		p.setInt(18, 2009);
		p.setString(19, "ms");
		p.setInt(20, 1760);

		int i=p.executeUpdate();
		System.out.println(i);
	}
}
