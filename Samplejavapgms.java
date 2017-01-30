/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package samplejavapgms;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Samplejavapgms {
    public int i;

   public void nNumbers()
   {
       int a[]=new int[10];
       System.out.println("Enter the numbers");
       Scanner s =new Scanner(System.in);
       for(int i=0;i<10;i++)
       {
           a[i]=s.nextInt();
           
       }
       for(i=0;i<10;i++)
       {
           System.out.println(a[i]);
       }
      
   }
    
}
