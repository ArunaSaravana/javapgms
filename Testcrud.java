package ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testcrud {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=Testconnection.getConnection();
		System.out.println(con);
		
		insert(con);
		delete(con);
	update(con);
		display(con);
	}

private static void insert(Connection con) throws SQLException {
		String q="insert into student values(2,'Sai','Tenkasi',98536272),(3,'Charann','Avadi',564325687),(4,'Vino','Trichy',7685765)";
		String q1="insert into student values(4,'Divya','Medavakkam',3242434),(8,'Priya','Tuty',324345657),(9,'Sangeetha','Annanur',3466545)";
		PreparedStatement p=con.prepareStatement(q);
		PreparedStatement p1=con.prepareStatement(q1);
		int j=p.executeUpdate();
		int i=p1.executeUpdate();
		System.out.println("Row to be inserted"+i+""+j);
	}
	private static void delete(Connection con) throws SQLException {
	String q2="delete from student where sid=8";
	PreparedStatement p2=con.prepareStatement(q2);
	int m=p2.executeUpdate();
	System.out.println("No. of rows deleted :"  +m);
}
private static void update(Connection con) throws SQLException {
		String q3="update student set sname='bala' where sid='9'";
		PreparedStatement p3=con.prepareStatement(q3);
		int x=p3.executeUpdate();
		System.out.println(x);
	
	}
	private static void display(Connection con)throws SQLException{
		String q4="select * from student where sname='sai'";
		PreparedStatement p4=con.prepareStatement(q4);
		ResultSet rs=p4.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt(17));
		}
	}
}
