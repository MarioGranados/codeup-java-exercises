package shapes;

abstract class Shape {
    protected double length; protected double width;
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract void setWidth(double width);

    abstract void setLength(double length);
}
