package Abstraction;

public class circle1 extends shape1{

    double r;
    public circle1(int num,double r)
    {
        super(num);
        System.out.println("CIRCLE  ABSTRACTION CALLED");
        this.r=r;
    }
    public double area()
    {
       return (3.14*r*r);
    }



}
