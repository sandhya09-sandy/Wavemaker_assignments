package inheritance1;

public class cone extends Shapes{

   public double area()
   {
       return (3.14*radius()*radius())+(3.14*radius()*slantlength());
   }
   public double volume()
   {
       return (3.14*r*slantlength());
   }

}
