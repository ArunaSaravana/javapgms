/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Studentgradeimplements implements Studentgradeinter {
    
    @Override
    public void addstudent(String name,int year)
    {
       if(year==2017) 
       {
           System.out.println("Student is added to 1st year");
       }
    }
    @Override
    public void editstudent(int year)
    {
        if(year==2016)
        {
            System.out.println("Student moved to 2nd year");
                    
        }
            
    }
}
