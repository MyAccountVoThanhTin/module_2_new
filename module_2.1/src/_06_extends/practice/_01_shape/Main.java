package _06_extends.practice._01_shape;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("blue",true,3.5);
        System.out.println(square);
    }
}
