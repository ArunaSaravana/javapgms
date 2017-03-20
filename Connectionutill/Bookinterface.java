package Connectionutill;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Bookinterface {
	public void insert(Ebook e)throws SQLException,ClassNotFoundException;
	public void delete(Ebook e)throws SQLException,ClassNotFoundException;
	public void update(Ebook e)throws SQLException,ClassNotFoundException;
	public List display(Ebook e)throws SQLException,ClassNotFoundException;
	public List dbid(Ebook e)throws SQLException,ClassNotFoundException;
	public List dbname(Ebook e)throws SQLException,ClassNotFoundException;
	
}
