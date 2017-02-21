package ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Testemployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=Testconnection.getConnection();
		//System.out.println(con);
	/*	Testinsert ti=new Testinsert();
		ti.insert(con);
		Testdelete td=new Testdelete();
		td.delete(con);
		Testupdate tu=new Testupdate();
		tu.update(con);*/
		Testdisplay tp=new Testdisplay();
		tp.display(con);
	}		



	
	
		
}
