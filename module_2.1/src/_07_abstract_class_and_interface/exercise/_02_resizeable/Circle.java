package _07_abstract_class_and_interface.exercise._02_resizeable;

import _07_abstract_class_and_interface.exercise._01_colorable.Shape;

public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public void resize(double percent){
        //this.radius = getRadius() + percent;
        setRadius(getRadius() + percent);
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()+" "+getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
