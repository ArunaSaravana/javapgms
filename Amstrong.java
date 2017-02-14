/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

/**
 *
 * @author Student
 */
public class Amstrong {
    public static void main(String args[])
    {
        int n=153,sum=0,r,t;
        System.out.println(n);
        t=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
            
        }
        if(t==sum)
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");
    }
}
