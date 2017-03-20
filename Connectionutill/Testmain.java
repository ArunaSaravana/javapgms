package Connectionutill;

import java.sql.Connection;
import java.sql.SQLException;

public class Testmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println(con);
		Bookimplement bi=new Bookimplement();
		bi.insert(con);
		//bi.delete(con);
		//bi.update(con);
		bi.display(con);
		bi.dbid(con);
		bi.dbname(con);
	}

}
