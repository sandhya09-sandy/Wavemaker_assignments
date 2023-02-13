package Polymorphism;

public class SHAPES {
    //method overloading
    public String str;

    public void display()
    {
        System.out.println("This is the shapes class in  polymorphism package");
    }
    public void display(String str)
    {
        System.out.println("This is the "+str+" class in  polymorphism package");
    }
    public void display(int l)
    {
        System.out.println("This is the circle class in  polymorphism package");
    }
    public void display(char c)
    {
        System.out.println("This is the rectangle class in  polymorphism package");
    }
    public String display(double d)
    {
        str="This is the ellipse class in  polymorphism package";
        return  str;
    }
    //method overriding
    public void show()
    {
        System.out.println("This is the show method of shapes in polymorphism");
    }
}
