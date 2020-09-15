package _06_extends.practice._01_shape;

public class Rectangle extends Shape {
    private double width = 1.0,height = 1.0;
    Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return (this.height + this.width)* 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " +getWidth() + "and length = "+getHeight()+" , which is a subclass of " +super.toString();
    }
}
