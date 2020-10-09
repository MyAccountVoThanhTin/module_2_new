package _0_project_furama_resort._03_controllers;

import _0_project_furama_resort._01_models.*;
import _0_project_furama_resort._04_commons.*;

import java.util.*;
import java.util.regex.Pattern;

public class MainController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("Enter your choose !\n" +
                "Menu : \n" +
                "1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                new AddNewServices().addNewServices();
                break;
            case 2:
                new ShowServices().show();
                break;
            case 3:
                new AddNewCustomer().addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                new ShowInformationCustomer().showInformationCustomer();
                displayMainMenu();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Enter your choose again [1-7]!");
                displayMainMenu();
        }
    }

    public static void main(String[] args) {
        new MainController().displayMainMenu();
    }
}

