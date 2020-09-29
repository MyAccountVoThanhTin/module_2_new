package review;

import java.util.Scanner;

public class DemoMenu {
    public static void showMenu() {
        System.out.println("1 Add.\n" +
                "2 Update. \n" +
                "3 Delete. \n" +
                "4 Exit");
        System.out.print("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                System.out.println("Add new ...");
                showMenu();
                break;
            case 2:
                System.out.println("Update  ...");
                showMenu();
                break;
            case 3:
                System.out.println("Delete  ...");
                showMenu();
                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println("input error, input again..");
                showMenu();
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
