package _06_extends.exercise._01_circle_and_cylinder;

import _06_extends.exercise._01_circle_and_cylinder.Circle;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(){

    }

    public Cylinder(int height){
        this.height = height;
    }
    public Cylinder(double radius,String color){
        super(radius,color);
    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double cylindricalArea(){
        return super.area() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylindrical Area with Circle's Area have radius is  "+super.getRadius()+" color is "+super.getColor()+
                " is "+this.cylindricalArea();
    }
}
