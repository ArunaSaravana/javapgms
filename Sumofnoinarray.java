
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Sumofnoinarray {
     public int i,sum=0;

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
           sum=sum+a[i];
          
       }
       System.out.println("The sum of the array is"+ sum);
   }
    
}
