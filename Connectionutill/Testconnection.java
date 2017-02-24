/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectionutill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class Testconnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("org.h2.Driver");
    Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    //System.out.println(conn);
    return conn;
}
}
