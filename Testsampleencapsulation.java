/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testfiles;

import javafiles.Sampleencapuslation;

/**
 *
 * @author Student
 */
public class Testsampleencapsulation {
    public static void main(String args[])
    {
     Sampleencapuslation se=new Sampleencapuslation();
     se.setrno(101);
     se.setname("Sai");
     se.setdept("MS");
     se.setyear(2017);
     System.out.println("Student RollNo :" +se.getrno());
     System.out.println("Student Name :" +se.getname());
     System.out.println("Student department :" +se.getdept());
     System.out.println("Student year :" +se.getyear());
     
    }
    
}
