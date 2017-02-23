package sourcecode;

import java.sql.Connection;
import java.sql.SQLException;

public interface Hotel {
	public void insert(Connection con) throws SQLException;
	public void delete(Connection con) throws SQLException;
	public void update(Connection con) throws SQLException;
	public void display(Connection con) throws SQLException;
	
}
