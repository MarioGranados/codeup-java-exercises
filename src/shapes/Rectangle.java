package shapes;

import org.w3c.dom.css.Rect;

public class Rectangle {
    protected double length;
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
    }

}
