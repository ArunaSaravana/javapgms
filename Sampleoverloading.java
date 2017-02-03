/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Sampleoverloading {
    public void mul(int x,int y)
    {
        int z=x*y;
        System.out.println("The result is :"+z);
        
    }
    public void mul(int a,int b,int c)
    {
        int d=(a+b)/c;
        System.out.println("The result is:"+d);
    }
    public void mul(float w,float n)
    {
        float m=w%n;
        System.out.println("The result is:"+m);
    }
}
