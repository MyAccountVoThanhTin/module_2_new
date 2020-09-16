package _07_abstract_class_and_interface.exercise._01_colorable;

import sun.swing.StringUIClientPropertyKey;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", true, 3.5);
        shapes[1] = new Rectangle(2.0, 4.0, "yellow", true);
        shapes[2] = new Square(5.0, "red", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.howToColor());
            }
        }
    }
}
