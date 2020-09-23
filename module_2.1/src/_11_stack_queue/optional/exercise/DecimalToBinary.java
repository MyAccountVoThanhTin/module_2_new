package _11_stack_queue.optional.exercise;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        long num;
        do {
            System.out.println("Enter a num : ");
            num = scanner.nextLong();
        }while (num < 2);
       long temp = 0;
       while (num >= 1){
           temp = num % 2;
           num = num/2;
           stack.add(temp);
           if (num == 1){
               stack.add(1);
               break;
           }
       }
        System.out.println("Binary of num "+ num + " is : ");
       while (! stack.isEmpty()){
           System.out.print(stack.pop());
       }
    }
}
