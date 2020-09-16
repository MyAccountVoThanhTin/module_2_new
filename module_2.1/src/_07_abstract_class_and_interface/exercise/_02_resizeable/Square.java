package _07_abstract_class_and_interface.exercise._02_resizeable;

public class Square extends Rectangle implements Resizeable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    public double getArea() {
        return getSide() * getSide();
    }
    public void resize(double percent){
        setSide(getSide() + percent);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()+" "+ getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
