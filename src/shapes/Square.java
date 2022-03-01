package shapes;


public class Square extends Quadrilateral implements Measurable {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
/*public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }


    //Overrided stuff below
    public Square(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        System.out.println("overloaded");
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("overloaded");
        return (2 * this.side);
    }
}*/
