package sourcecode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Implementhotel implements Hotel
{

	@Override
	public void insert(Connection con) throws SQLException 
	{
		String q="insert into hotel(dname,dprice,dtime)values(?,?,?),(?,?,?);";
		PreparedStatement p=con.prepareStatement(q);
		p.setString(1,"appam");
		p.setFloat(2, 22.50f);
		p.setString(3, "mor,eve");
		
		p.setString(4, "idyapam");
		p.setFloat(5, 30.00f);
		p.setString(6, "evening");
		int a=p.executeUpdate();
		System.out.println("No of rows added :"+a);
		
	}

	@Override
	public void delete(Connection con) throws SQLException
	{
		String q1="delete from hotel where dprice=?";
		PreparedStatement p1=con.prepareStatement(q1);
		p1.setFloat(1, 22.50f);
		int b=p1.executeUpdate();
		System.out.println("No of rows deleted :"+b);
				
	}

	@Override
	public void update(Connection con) throws SQLException
	{
		String q2="update hotel set dname=? where dtime=?";
		PreparedStatement p2=con.prepareStatement(q2);
		p2.setString(1, "tomatorice");
		p2.setString(2, "afternoon");
		int c=p2.executeUpdate();
		System.out.println("No of rows updated :"+c);
	}

	@Override
	public void display(Connection con) throws SQLException 
	{
		String q3="select did,dname,dtime from hotel where dprice>? ";
		PreparedStatement p3=con.prepareStatement(q3);
		p3.setFloat(1, 30.00f);
		ResultSet r=p3.executeQuery();
		while(r.next())
		{
			System.out.println(r.getInt("did") + r.getString("dname") + r.getString("dtime"));
		}
	
	}
	

}
