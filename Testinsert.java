package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testinsert {
	public void insert(Connection con) throws SQLException {
		String q="insert into employee values(3,'saicharann','london','doctor',100000,6548988),(4,'vino','trichy','engineer',890000,6548988)";
		String q1="insert into employee values(5,'deepika','madurai','principal',34000,67666578),(6,'bala','tenkasi','lawyer',10000,876543421)";
		PreparedStatement p=con.prepareStatement(q);
		PreparedStatement p1=con.prepareStatement(q1);
		int i=p.executeUpdate();
		int j=p1.executeUpdate();
		System.out.println("No of rows inserted :"+i+ "" +j);
}
}