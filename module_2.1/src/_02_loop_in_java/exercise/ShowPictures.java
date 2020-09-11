package _02_loop_in_java.exercise;

import java.util.Scanner;

public class ShowPictures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1.  The rectangle" +
                "\n 2. The square triangle" +
                "\n 3. Isosceles triangle" +
                "\n 4. Exit !");
        int choice = scanner.nextInt();
        if (choice == 4) {
            System.exit(0);
        } else {
            int height, weight;
            switch (choice) {
                case 1:
                    System.out.println("Enter height : ");
                    height = scanner.nextInt();
                    System.out.println("Enter weight : ");
                    weight = scanner.nextInt();
                    for (int i = 0; i <= height; i++) {
                        for (int j = 0; j <= weight; j++) {
                            System.out.print("*");
                            if (j == weight) {
                                System.out.println("\n");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter height : ");
                    height = scanner.nextInt();
                    for (int i = 0; i <= height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                            if (j == i) {
                                System.out.println("\n");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter height : ");
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println("\n ");
                    }
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}

