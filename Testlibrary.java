package ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Testlibrary {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=Testconnection.getConnection();
		System.out.println(con);
	//	libinsert li=new libinsert();
	//	li.insert(con);
	//	libdelete ld=new libdelete();
	//	ld.delete(con);
	//	libupdate lu=new libupdate();
	//	lu.update(con);
		libdisplay lp=new libdisplay();
		lp.display(con);
	}

}
