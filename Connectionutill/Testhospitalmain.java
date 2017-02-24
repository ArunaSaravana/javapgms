/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectionutill;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class Testhospitalmain {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Hospitalimple hi=new Hospitalimple();
       // hi.insert(null);
        hi.display(null);
    }
}
