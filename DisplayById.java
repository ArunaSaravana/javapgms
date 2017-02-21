package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = Testconnection.getConnection();
		String query = "select eid, address from employee where address='london'";
		PreparedStatement p = con.prepareStatement(query);
		ResultSet r = p.executeQuery();
		while (r.next()) {
			System.out.println(r.getInt("eid") + r.getString("address"));
		}

	}

}
