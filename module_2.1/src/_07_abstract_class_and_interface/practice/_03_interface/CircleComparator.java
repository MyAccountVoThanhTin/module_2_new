package _07_abstract_class_and_interface.practice._03_interface;

import _06_extends.exercise._01_circle_and_cylinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public CircleComparator() {
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()){
            return 1;
        } else if (o1.getRadius() < o2.getRadius()){
            return -1;
        } else return 0;
    }

}
