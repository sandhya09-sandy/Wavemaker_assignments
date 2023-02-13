package inheritance1;

public class Shapes {
    public int a=10;
    public String s="SANDHYA";
    public char c='s';

    public double h;
    public double w;
    public double l;
    public double r;
    public double sl;
    public Shapes()
    {
        System.out.println("This is the shapes super class default constructor");
    }

    public void set(double h,double w)
    {
        this.h=h;
        this.w=w;
    }
    public void setradius(double r)
    {
        this.r=r;
    }
    public void setslant(double sl)
    {
        this.sl=sl;
    }
    public void setsq(double l)
    {
        this.l=l;
    }
    public double height()
    {
        return h;
    }
    public double width()
    {
        return w;
    }
    public double radius()
    {
        return r;
    }
    public double slantlength()
    {
        return sl;
    }
    public void getdisplay()
    {
        System.out.println("This is the class and objects method");
    }
}


