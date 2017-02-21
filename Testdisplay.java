package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testdisplay {
	public void display(Connection con) throws SQLException {
		String q4 = "SELECT ename FROM EMPLOYEE where address='london'";
		// String q5="Select ename,desg,address from employee where
		// salary>50000";
		PreparedStatement p4 = con.prepareStatement(q4);
		// PreparedStatement p5=con.prepareStatement(q5);
		ResultSet rs = p4.executeQuery();
		if (rs.next()) {
			System.out
					.println(rs.getInt("eid") + rs.getString("ename") + rs.getString("address") + rs.getString("desg"));
		}
	}

}
