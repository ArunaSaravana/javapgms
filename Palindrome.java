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
public class Palindrome {
   public static void main(String args[]) 
   {
       int n=345,r,sum=0,t;
       System.out.println(n);
       t=n;
       while(n>0)
       {
           r=n%10;
           sum=(sum*10)+r;
           n=n/10;
       }
       if(t==sum)
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");
   }
}
