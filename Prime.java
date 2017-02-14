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
public class Prime {
    public static void main(String args[])
    {
        int i,j,count=0,s,e;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the starting no:");
        s=n.nextInt();
        System.out.println("Enter the ending no:");
        e=n.nextInt();
       for(i=s; i<=e; i++)
        {
            //count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
