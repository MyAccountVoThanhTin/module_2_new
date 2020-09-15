package _06_extends.exercise._01_circle_and_cylinder;

import _06_extends.exercise._01_circle_and_cylinder.Circle;
import _06_extends.exercise._01_circle_and_cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder();
        System.out.println(cylinder);
        Circle cylinder_1 = new Cylinder(5);
        System.out.println(cylinder_1);
        Circle cylinder_2 = new Cylinder(3.5,"yellow",6);
        System.out.println(cylinder_2);
    }
}
