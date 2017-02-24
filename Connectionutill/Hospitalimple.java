/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectionutill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Student
 */
public class Hospitalimple implements Hospital
{

    

    @Override
    public void insert(Hospital h) throws SQLException,ClassNotFoundException
    {
        Connection con=Testconnection.getConnection();
        String q="insert into hospital(hname,dname,category,fees)values(?,?,?,?),(?,?,?,?)";
        PreparedStatement p=con.prepareStatement(q);
        p.setString(1,"Den Hospital");
        p.setString(2,"Aruna");
        p.setString(3,"General");
        p.setInt(4,500);
        
        p.setString(5,"RR Hospital");
        p.setString(6,"Saravana");
        p.setString(7,"physio");
        p.setInt(8,800);
        int a=p.executeUpdate();
        System.out.println("No of rows added :" +a);
    }

    @Override
    public List display(Hospital h) throws SQLException,ClassNotFoundException
    {
        Connection con=Testconnection.getConnection();
        String q1="select * from hospital";
        PreparedStatement p1=con.prepareStatement(q1);
        ResultSet r=p1.executeQuery();
        while(r.next())
        {
            System.out.println(r.getInt("hid") + r.getString("hname") + r.getString("dname") + r.getString("category") + r.getInt("fees"));
        }
        r.close();
        con.close();
        return null;
    }
}    

