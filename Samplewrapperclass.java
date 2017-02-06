/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author Student
 */
public class Samplewrapperclass {
    public void dis()
    {
        int x=10;
        int y=20;
        Integer n=Integer.valueOf(x);
        Integer m=y;
        System.out.println("Autoboxing:"+n + "   "+m);
    }
    public void dis1()
    {
        Integer a=34;
        Integer b=278;
        int z=a.intValue();
        int e=b.intValue();
        System.out.println("Unboxing:"+z+"   "+e);
        
    }


}
