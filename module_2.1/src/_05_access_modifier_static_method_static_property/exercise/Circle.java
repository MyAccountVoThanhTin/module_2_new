package _05_access_modifier_static_method_static_property.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double area(){
        return this.radius * this.radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area());
        circle.setRadius(2.0);
        System.out.println(circle.area());

    }
}
