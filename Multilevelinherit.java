package javaprograms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
class X
{
    public void dis()
    {
        System.out.println("Base class");
    }
}
class Y extends X
{
    public void dis1()
    {
        System.out.println("Sub class");
        
    }
}

public class Multilevelinherit extends Y {
    public void dis2()
    {
        System.out.println("Multilevel Inheritance");
    }
    
}
