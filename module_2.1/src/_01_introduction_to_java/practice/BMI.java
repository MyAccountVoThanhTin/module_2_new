package _01_introduction_to_java.practice;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height,weight,bmi;
        System.out.println("Enter height : ");
        height = scanner.nextDouble();
        System.out.println("Enter weight : ");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        if(bmi < 18.5 ){
            System.out.println("Your BMI is "+bmi+" Underweight !");
        } else if (bmi < 25.0) {
            System.out.println("Your BMI is "+bmi+" Normal ! !");
        }else if(bmi < 30.0){
            System.out.println("Your BMI is "+bmi+" Overweight !");
        }else {
            System.out.println("Your BMI is "+bmi+" Obese !");
        }
    }
}
