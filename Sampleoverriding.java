/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Sampleoverriding {
    int roi=100;
}
class Axix extends Sampleoverriding{
    public void calculate()
    {
        roi=roi*5;
        System.out.println(roi);
    }
   
}
class ICICI extends Sampleoverriding{
     public void calculate()
    {
        roi=roi*2;
        System.out.println(roi);
    }
   
}
        
   
