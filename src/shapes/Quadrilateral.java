package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length; protected double width;

    Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract double setLength();

    public abstract double setWidth();
}
