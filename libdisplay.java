package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class libdisplay {
	public void display(Connection con) throws SQLException
	{
		String q3="select * from library where bpublish=?";
//		String q4="select bname from library where pyear<=?";
	//	String q5="select bname,amt from library where amt>?";
		PreparedStatement p3=con.prepareStatement(q3);
		//PreparedStatement p4=con.prepareStatement(q4);
		//PreparedStatement p5=con.prepareStatement(q5);
		p3.setString(1, "microsoft");
		//p4.setInt(2, 2005);
		//p5.setInt(3, 500);
		ResultSet r1=p3.executeQuery();
		//ResultSet r2=p4.executeQuery();
		//ResultSet r3=p5.executeQuery();
		while(r1.next())
		{
			System.out.println(r1.getInt("bid")+ r1.getString("bname")+ r1.getInt("pyear")+ r1.getString("bpublish")+ r1.getInt("amt"));
		}
		/*if(r2.next())
		{
			System.out.println(r2.getString("bname"));
			
		}
		if(r3.next())
		{
			System.out.println(r3.getString("bname")+ r3.getInt("amt"));
		}*/
	}
}
