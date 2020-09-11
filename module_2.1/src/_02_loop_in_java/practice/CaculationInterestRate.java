package _02_loop_in_java.practice;

import java.util.Scanner;

public class CaculationInterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tiền gửi
        System.out.println("Enter investment mount : ");
        double money = scanner.nextDouble();
        // Số tháng gửi
        System.out.println("Enter month : ");
        int month = scanner.nextInt();
        //Lãi suất
        System.out.println("Enter interset rate : ");
        double intersetRate = scanner.nextDouble();
        double totalInterset = 1.0;
        for (int i = 0; i < month; i++) {
            totalInterset += money * (intersetRate / 100) / 12 * month;
        }
        System.out.println("Total of interset: " +totalInterset);
    }
}
