package _0_project_furama_resort._03_controllers;

import _0_project_furama_resort._01_models.*;
import _0_project_furama_resort._04_commons.*;

import java.util.*;
import java.util.regex.Pattern;

public class MainController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        int choose;
        do {
            System.out.println("Enter your choose !\n" +
                    "Menu : \n" +
                    "1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.print("Please input your choice :");
            choose = scanner.nextInt();
            if(choose == 1 ){
                new AddNewServices().addNewServices();
            }else if(choose == 2 ){
                new ShowServices().show();
            }else if(choose == 3 ){
                new AddNewCustomer().addNewCustomer();
            }else if(choose == 4 ){
                new ShowInformationCustomer().showInformationCustomer();
            }else if(choose == 5 ){
                new AddNewBooking().addNewBooking();
            }else if(choose == 6 ){
                new ShowInforEmployee().showInforEmployee();
            }else if(choose == 7 ){
                System.exit(0);
            }
        } while (choose >= 1 && choose <= 7);
        System.out.println("Choose Again [1-7] ");
        displayMainMenu();
    }

    public static void main(String[] args) {
        new MainController().displayMainMenu();
    }
}

