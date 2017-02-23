package sourcecode;

import java.sql.Connection;
import java.sql.SQLException;

public class Testhotel {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Connection con=Tconnection.getConnection();
		System.out.println(con);
		Implementhotel im=new Implementhotel();
		//im.insert(con);
		//im.delete(con);
		//im.update(con);
		im.display(con);
	}
}
