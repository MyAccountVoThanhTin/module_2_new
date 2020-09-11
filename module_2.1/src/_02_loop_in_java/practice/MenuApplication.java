package _02_loop_in_java.practice;

import java.util.Scanner;

public class MenuApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println(" 1. Draw the triangle" +
                "\n 2. Draw the square" +
                "\n 3. Draw the rectangle" +
                "\n 0. Exit");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0;i < 4; i++){
                        for (int j = 0 ;j <= i ;j++){
                            System.out.print("*");
                            if(j == i){
                                System.out.println("\n");
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0 ; i <= 4 ; i++){
                        for (int j = 0 ;j <= 4; j++){
                            System.out.print("*");
                            if(j == 4){
                                System.out.println("\n");
                            }
                        }
                    }
                    break;
                case 3:
                    for (int i = 0 ; i <= 4 ; i++){
                        for (int j = 0 ;j <= 6; j++){
                            System.out.print("*");
                            if(j == 6){
                                System.out.println("\n");
                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
