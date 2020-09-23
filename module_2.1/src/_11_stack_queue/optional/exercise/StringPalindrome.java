package _11_stack_queue.optional.exercise;

import java.util.Scanner;
import java.util.Stack;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = scanner.nextLine();
        string.toLowerCase();
        Stack stack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        System.out.println(stack);
        System.out.println(isCheck(string, stack));
    }

    private static boolean isCheck(String string, Stack stack) {
        int j = 0;
        boolean check = true;
        while (j < string.length()) {
            Character temp = (Character) stack.pop();
            if (temp.equals( string.charAt(j))) {
                j++;
                check = true;
                continue;
            }
            check = false;
            break;
        }
        return (check) ? true : false;
    }
}
