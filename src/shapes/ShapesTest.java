package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(4);
        Measurable myOtherShape = new Rectangle(4, 10);


        System.out.println("Square:");
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("Rectangle");
        System.out.println(myOtherShape.getArea());
        System.out.println(myOtherShape.getPerimeter());

/*        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Rectangle box2 = new Square(5.0);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());*/

    }
}
