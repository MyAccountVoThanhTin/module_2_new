package _01_introduction_to_java.practice;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        float a = scanner.nextFloat();
        System.out.println("Enter b : ");
        float b = scanner.nextFloat();
        System.out.println("Enter c : ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        } else {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
    }
}
