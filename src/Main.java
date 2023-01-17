public class Main {
    public static void main(String[] args) {
        Shape sh1=new Shape("BLUE",false);
        Shape sh2=new Shape();
        Circle c1=new Circle("BLACK",false,5.2);
        Circle c2 =new Circle(7.1);
        Circle c3=new Circle();
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(10.1,15.3);
        Rectangle r3=new Rectangle("RED",true,18.2,25.6);
        Square s1=new Square(40.2);
        Square s2=new Square("GREEN",true,9.3);
        Square s3=new Square();
        System.out.println("-CLASS SHAPE OPJECTS INFO-");
        System.out.println("OBJECT 1");
        System.out.println(sh1.getColor());
        System.out.println(sh1.isFilled());
        System.out.println(sh1.toString());
        System.out.println("OBJECT 2");
        System.out.println(sh2.toString());
        System.out.println("-------------------");
        System.out.println("-CLASS CIRCLE OPJECTS INFO-");
        System.out.println(c1.toString());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println("-------------------");
        System.out.println("-CLASS RECTANGLE OPJECTS INFO-");
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println("-------------------");
        System.out.println("-CLASS SEQUARE OPJECTS INFO-");
        System.out.println(s1.toString());
        System.out.println(s1.getSide());




    }
}