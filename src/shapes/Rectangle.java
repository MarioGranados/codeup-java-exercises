package shapes;


public class Rectangle extends Quadrilateral implements Measurable{
    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setWidth(double width) {
        super.width = width;
    }

    @Override
    void setLength(double length) {
        super.length = length;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }


}

/*public class Rectangle {
*//*    protected double length;
    protected double width;
    protected double side;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double side) {
        this.side = side;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return ((length + width) * 2);
    }*//*

}*/

