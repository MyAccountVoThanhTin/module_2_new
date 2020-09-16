package _07_abstract_class_and_interface.exercise._02_resizeable;


import _07_abstract_class_and_interface.exercise._01_colorable.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", true, 3.5);
        shapes[1] = new Rectangle(2.0, 4.0, "yellow", true);
        shapes[2] = new Square(5.0, "blue", true);
        System.out.println("Before random : ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("After random : ");
        for (Shape shape1 : shapes) {
            double percent = 1 + (Math.random() * 99);
            if (shape1 instanceof Circle) {
                Circle circle = (Circle) shape1;
                circle.resize(percent);
                System.out.println(circle.getArea());
            } else if (shape1 instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape1;
                rectangle.resize(percent);
                System.out.println(rectangle.getArea());
            } else if (shape1 instanceof Square) {
                Square square = (Square) shape1;
                square.resize(percent);
                System.out.println(square.getArea());
            } else return ;
        }
    }
}
