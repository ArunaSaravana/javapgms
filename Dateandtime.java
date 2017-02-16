/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.text.*;
import java.util.*;

/**
 *
 * @author Student
 */
public class Dateandtime {
    public static void main(String args[])throws Exception
    {
        Date d=new Date();
        SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f2=new SimpleDateFormat("E");
        SimpleDateFormat f3=new SimpleDateFormat("hh:ss:mm a");
        System.out.println("Current Date is :" +f1.format(d));
        System.out.println("Today day is :" +f2.format(d));
        System.out.println("Current Time is :" +f3.format(d));
                
    }
    
}
