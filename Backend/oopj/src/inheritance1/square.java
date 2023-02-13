package inheritance1;

public class square extends rectangle{

          public double length=5;
          public square()
          {
              System.out.println("This is the square class default constructor");
          }
          public square(double l)
          {System.out.println("This is the square class parameterised constructor");
          }
          public double sqarea()
          {
              System.out.println("Area of square is");
              return length * length;
          }
          public double vol()
          {
              System.out.println("Volume of a square is");
              return length*length*length;
          }
}
