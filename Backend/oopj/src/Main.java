import Abstraction.rectangle1;
import Polymorphism.FIGURES;
import inheritance1.CIRCLE;
import inheritance1.Shapes;
import inheritance1.rectangle;
import inheritance1.square;
import inheritance1.cone;
import Polymorphism.SHAPES;
import Polymorphism.FIGURES;
import Abstraction.circle1;
import Abstraction.shape1;
import Encapsulation.shape2;
public class Main {
    public static void main(String[] args) {

        //CLASSES AND OBJECTS
        System.out.println("CLASSES AND OBJECTS");
        Shapes sh1=new Shapes();
        System.out.println(sh1.a);
        System.out.println(sh1.s);
        System.out.println(sh1.c);
        sh1.getdisplay();

       //ABSTRACTION
        System.out.println("...................");
        System.out.println("ABSTRACTION........");
        shape1 s1=new circle1(5,3.5);
        System.out.println(s1.area());
        shape1 s2=new rectangle1(5,4.2, 6.5);
        System.out.println(s2.area());

        //Encapsulation
        shape2 s3=new shape2();
        s3.setl(5);
        s3.seth(10);
        System.out.println("length is..."+s3.getl());
        System.out.println("height is..."+s3.geth());

        //POLYMORPHISM
        System.out.println("...................");
        System.out.println("METHOD OVERLOADING.....");
        //METHOD OVERLOADING
        SHAPES sh=new SHAPES();
        sh.display();
        sh.display("cone");
        sh.display(4);
        sh.display(4.000);
        sh.display(5.5);
        sh.display('c');
        //METHOD OVERRIDING
        System.out.println("...................");
        System.out.println("METHOD OVERRIDING.....");
        FIGURES f=new FIGURES();
        f.display();
        f.show();
        sh.show();

        //INHERITANCE
        System.out.println("...................");
        System.out.println("INHERITANCE.....");
        //Single inheritance
        System.out.println("...................");
        System.out.println("SINGLE INHERITANCE.....");
        rectangle c=new rectangle();
        c.set(3,5);
        System.out.println(c.area());
        System.out.println(c.volume());
        //HIERACHIAL INHERITANCE
        System.out.println("...................");
        System.out.println("HIERACHIAL INHERITANCE.....");
        cone cn=new cone();
        cn.setslant(3);
        cn.setradius(4);
        System.out.println("Area of cone is");
        System.out.println(cn.area());
        System.out.println("volume of cone is");
        System.out.println(cn.volume());
        CIRCLE cir=new CIRCLE();
        cir.setradius(5);
        System.out.println("Area of circle is");
        System.out.println(cir.area());
       //Multiple inheritance
        System.out.println("...................");
        System.out.println("MULTIPLE INHERITANCE.....");
        square sq=new square();
        sq.setsq(5);
        System.out.println("Area and volume of square  is");
        System.out.println(sq.sqarea());
        System.out.println(sq.vol());

    }
}