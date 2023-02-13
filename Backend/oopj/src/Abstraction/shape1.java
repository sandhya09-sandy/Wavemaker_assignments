package Abstraction;

public abstract class shape1 {
    int num;
    public abstract double area();
    public shape1(int num)
    {
        System.out.println("SHAPES ABSTRACTION CALLED");
        this.num=num;
    }
    public int getnum()
    {
        return num;
    }


}
