package inheritance1;
public class CIRCLE extends Shapes{
    public float r;
    public double a;
    public CIRCLE()
    {
        System.out.println("This is the circle class default constructor");
    }
    public CIRCLE(double r)
    {System.out.println("This is the circle class parameterised constructor");
    }

    public double area()
    {
        a= 3.14*radius()*radius();
        return a;
    }


}


