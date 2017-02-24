/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectionutill;

/**
 *
 * @author Student
 */
public class Hospitalbean {
    private int hid;
    private String hname;
    private String dname;
    private String category;
    private int fees;
    
    public int gethid()
    {
        return hid;
    }
    public void sethid(int hid)
    {
        this.hid=hid;
    }
    public String gethname()
    {
        return hname;
    }
    public void sethname(String hname)
    {
        this.hname=hname;
    }
    public String getdname()
    {
        return dname;
    }
    public void setdname(String dname)
    {
        this.dname=dname;
    }
    public String getcategory()
    {
        return category;
    }
    public void setcategory(String categoryy)
    {
        this.category=category;
    }
    public int getfees()
    {
        return fees;
    }
    public void setfees(int fees)
    {
        this.fees=fees;
    }

    
}
