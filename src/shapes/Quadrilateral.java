package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    public Quadrilateral(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return super.getLength() + super.getWidth();
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }
}
