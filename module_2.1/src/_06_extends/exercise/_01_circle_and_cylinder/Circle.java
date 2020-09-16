package _06_extends.exercise._01_circle_and_cylinder;

public class Circle {
    public static final double PI = 3.14;
    private double radius;
    private String color;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return getRadius() * getRadius() * PI;
    }

    @Override
    public String toString() {
        return "Circle with radius is "+getRadius()+" have color is "+getColor()+" have Area is "+this.area();
    }
}
