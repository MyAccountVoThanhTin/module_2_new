package _15_exception_debug.exercise.class_illegalTriangleException;

import java.util.Scanner;

public class ClassIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numer 1 : ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter numer 2 : ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter numer 3 : ");
        double num3 = scanner.nextDouble();
        if(num1 < 0 || num2 < 0 || num3 < 0){
            throw new IllegalTriangleException(" Enter num >= 0");
        }
        if(num1 + num2 < num3 || num1 + num3 < num2 || num3 + num2 < num1){
            throw  new IllegalTriangleException(" NOT a regtangle !");
        }
    }

}
