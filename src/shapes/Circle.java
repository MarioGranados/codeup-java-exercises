package shapes;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        //area = pi x (radius ^ 2)
        return 3.14 * (this.radius * this.radius);
    }
    public double getCircumference() {
        //circumference = 2 x pi x radius
        return 2 * 3.14 * this.radius;
    }

/*    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.getArea();
        double circumference = circle.getCircumference();

        System.out.println("Area is " + area);
        System.out.println("Circumference is: "  + circumference);
    }*/
}
