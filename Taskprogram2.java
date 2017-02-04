/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaTaskprograms;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Taskprogram2 {
    public void task2()
    {
        int n,res;
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
       for(int i=0;i<n;i++)
        {
            res=i*i*i;
            System.out.println("The cube value is:"+  i +" "+res);
        }
            }
    

   
    }

    
    

