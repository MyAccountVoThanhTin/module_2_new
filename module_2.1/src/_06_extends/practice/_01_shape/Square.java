package _06_extends.practice._01_shape;

public class Square extends Rectangle {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    public Square(String color, boolean filled, double side) {
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public void setWidth(double width) {
        setWidth(side);
    }

    public void setHeight(double height) {
        setHeight(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
