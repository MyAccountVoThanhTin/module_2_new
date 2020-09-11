package _03_array_and_method_in_java.practise;

import java.util.Scanner;

public class ChageTemperature {
    public static double ce_Fa(double ce){
        double fa;
        return  fa = (9.0 / 5) * ce + 32;
    }
    public static double fa_Ca(double fa){
        double ce;
        return  ce =(5.0 / 9) * (fa - 32);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Menu :");
        System.out.println(" 1. Celsius to Fahrenheit" +
                "\n 2. Fahrenheit to Celsius" +
                "\n 0. Exit !");
        int choice;
        do {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Celsius : ");
                    double ces = scanner.nextDouble();
                    System.out.println("The Fahrenheit is: "+ce_Fa(ces));
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit : ");
                    double fah = scanner.nextDouble();
                    System.out.println("The Celsius is: "+fa_Ca(fah));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("NOT valiable !");
            }
        }while (choice != 0);

    }
}
