/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Stringsort {
    public static void main(String args[])
    {
        int i,j;
        String name[]=new String[5];
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the names");
        for(i=0;i<5;i++)
        {
            name[i]=s.nextLine();
        }
        System.out.println("After sorting");
        for(i=0;i<5;i++)
        {
            for(j=1;j<5;j++)
            {
                if(name[j-1].compareTo(name[j])>0)
                {
                temp=name[j-1];
                name[j-1]=name[j];
                name[j]=temp;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }
    }
    
}
