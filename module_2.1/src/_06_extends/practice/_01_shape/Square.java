package _06_extends.practice._01_shape;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
       setWidth(side);
       setHeight(side);
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    public Square(String color, boolean filled, double side) {
       super(color,filled,side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
