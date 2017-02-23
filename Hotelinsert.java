package sourcecode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hotelinsert {
	public void insert(Connection con) throws SQLException
	{
		String q="insert into hotel(dname,dprice,dtime)values(?,?,?),(?,?,?);";
		PreparedStatement p=con.prepareStatement(q);
		p.setString(1,"poori");
		p.setFloat(2, 12.50f);
		p.setString(3, "mor");
		
		p.setString(4, "pongal");
		p.setFloat(5, 30.00f);
		p.setString(6, "mor");
		int a=p.executeUpdate();
		System.out.println(a);
		
	}
}

