package _07_abstract_class_and_interface.practice._02_interface_comparable_for_shape;

import _06_extends.exercise._01_circle_and_cylinder.Circle;
import _07_abstract_class_and_interface.practice._03_interface.CircleComparator;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[2];
        circles[0] = new ComparableCircle(3.6,"yellow");
        circles[1] = new ComparableCircle();
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
//        Arrays.sort(circles);
//        System.out.println("After-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }
        System.out.println(ComparableCircle.compareTo(circles[0],circles[1]));
    }
}
