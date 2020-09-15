package _06_extends.exercise._03_point_and_movablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2.0f,3.0f,4.0f,5.0f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint.show());
        movablePoint.move();
        System.out.println(movablePoint.show());
    }
}
