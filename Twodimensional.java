
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
public class Twodimensional {
    public int i,j;
    public void minmax()
    {
        int a[][]=new int[2][2];
        int min,max;
        System.out.println("Enter the number:");
        Scanner s =new Scanner(System.in);
        for( i=0;i<a.length;i++)
        {
            for( j=0;j<a.length;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        min=a[0][0];
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                if(min>a[i][j])
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        max=a[0][0];
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                if(a[i][j]>max)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        System.out.println("minimum value"+min);
        System.out.println("maximum value"+max);
   }
}
