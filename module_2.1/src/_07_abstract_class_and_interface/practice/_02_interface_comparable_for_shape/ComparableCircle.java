package _07_abstract_class_and_interface.practice._02_interface_comparable_for_shape;

import _06_extends.exercise._01_circle_and_cylinder.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    public static int compareTo(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return 0;
    }
}
