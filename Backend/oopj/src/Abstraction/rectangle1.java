package Abstraction;

public class rectangle1 extends shape1{
    double l;
    double w;
    public rectangle1(int num,double l,double w)
    {
        super(num);
        this.l=l;
        this.w=w;
    }
    public double area()
    {
        return l*w;
    }

}
