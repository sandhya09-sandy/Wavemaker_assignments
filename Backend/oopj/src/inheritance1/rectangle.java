package inheritance1;

    public class rectangle extends Shapes
    {
        public double length=5;
        public double area()
        {
            System.out.println("Area of rectangle is");
            return height()*width();
        }
        public double volume()
        {
           System.out.println("Volume of a rectangle is");
            return length*height()*width();
        }
    }

