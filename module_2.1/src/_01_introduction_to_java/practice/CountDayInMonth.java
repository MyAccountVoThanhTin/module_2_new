package _01_introduction_to_java.practice;

import java.util.Scanner;

public class CountDayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month : ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            case 2:
                daysInMonth = "28 or 29";
                break;
            default:
                daysInMonth = "";
        }
        if(daysInMonth != ""){
            System.out.println("The month "+month+" has "+daysInMonth);
        }else {
            System.out.println("Invalid input!");
        }
    }
}
