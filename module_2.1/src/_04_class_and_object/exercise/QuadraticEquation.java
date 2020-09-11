package _04_class_and_object.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(double a,double b, double c){
        return b*2 - 4*a*c;
    }
    public double getRoot1(double a,double b, double c){
        return (-b + Math.sqrt(b*b - 4*a*c))/2*a;
    }
    public double getRoot2(double a,double b, double c){
        return (-b - Math.sqrt(b*b - 4*a*c))/2*a;
    }
    public double getRoot3(double a,double b,double c){
        return -b/(2*a);
    }
    public void Show(){
        if(this.getDiscriminant(a,b,c) < 0) {
            System.out.println("The equation has no roots !");
        }else if(this.getDiscriminant(a,b,c) == 0){
            System.out.println("The equation has one roots is : "+this.getRoot3(a,b,c));
        }else {
            System.out.println("The equation has one roots is : "+this.getRoot1(a,b,c)+" and "+this.getRoot2(a,b,c));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        QuadraticEquation equation1 = new QuadraticEquation(a,b,c);
        equation1.Show();
    }
}
