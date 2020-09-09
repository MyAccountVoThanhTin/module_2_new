package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        double a = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter USD : ");
        double usd = scanner.nextDouble();
        double exchage = usd * a;
        System.out.println("Exchage is : "+exchage+" VNĐ");
    }
}
