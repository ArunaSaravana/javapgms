package Connectionutill;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Bookimplement implements Bookinterface{

	@Override
	public void insert(Ebook e) throws SQLException,ClassNotFoundException
	{
		Connection con=Testconnection.getConnection();
		String q="insert into ebook(bname,type,bpub,price,rating)values(?,?,?,?,?),(?,?,?,?,?)";
		PreparedStatement p=con.prepareStatement(q);
		p.setString(1, "vb");
		p.setString(2, "dotnet");
		p.setInt(3, 2010);
		p.setInt(4, 900);
		p.setInt(5,3 );
		
		p.setString(6, "wingoffire");
		p.setString(7, "apj");
		p.setInt(8, 2007);
		p.setInt(9, 1000);
		p.setInt(10,10);
		int a=p.executeUpdate();
		System.out.println("No of rows added : "+a);
		
		
	}

	@Override
	public void delete(Ebook e) throws SQLException, ClassNotFoundException 
	{
		Connection con=Testconnection.getConnection();
		String q1="delete from ebook where bpub<?";
		PreparedStatement p1=con.prepareStatement(q1);
		p1.setInt(1, 2000);
		int b=p1.executeUpdate();
		System.out.println("No of rows deleted :"+b);
		
	}

	@Override
	public void update(Ebook e) throws SQLException, ClassNotFoundException 
	{
		Connection con=Testconnection.getConnection();
		File f=new File("D:\\sai");
		File l=new File("D:\\charann");
		if(f.exists())
		{
			System.out.println("File existed");
			f.renameTo(l);
			System.out.println("File renamed");
		}
		String q2="update ebook set rating=? where type=?";
		PreparedStatement p2=con.prepareStatement(q2);
		p2.setInt(1, 8);
		p2.setString(2, "apj");
		int d=p2.executeUpdate();
		System.out.println("No of rows updated:"+d);
		
		
		
	}

	@Override
	public List display(Ebook e) throws SQLException, ClassNotFoundException 
	{
		Connection con=Testconnection.getConnection();
		String q3="select * from ebook";
		PreparedStatement p3=con.prepareStatement(q3);
		ResultSet r=p3.executeQuery();
		while(r.next())
		{
			System.out.println(r.getInt("bid")  +  r.getString("bname")  +  r.getString("type")  +   r.getInt("bpub")  +   r.getInt("price")  +   r.getInt("rating"));
		}
		r.close();
		con.close();
		return null;
	}

	@Override
	public List dbid(Ebook e) throws SQLException, ClassNotFoundException 
	{
		Connection con=Testconnection.getConnection();
		String q4="select bid from ebook where rating>=?";
		PreparedStatement p4=con.prepareStatement(q4);
		p4.setInt(1, 5);
		ResultSet r1=p4.executeQuery();
		while(r1.next())
		{
			System.out.println(r1.getInt("bid"));
		}
		r1.close();
		con.close();
		return null;
	}

	@Override
	public List dbname(Ebook e) throws SQLException, ClassNotFoundException 
	{
		Connection con=Testconnection.getConnection();
		String q5="select bname from ebook where price>?";
		PreparedStatement p5=con.prepareStatement(q5);
		p5.setInt(1,500);

		ResultSet r2=p5.executeQuery();
		while(r2.next())
		{
			System.out.println(r2.getString("bname"));
		}
		r2.close();
		con.close();
		return null;
	}

}