package _11_stack_queue.optional.exercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static final Character BRACKET_LEFT = '(';
    public static final Character BRACKET_RIGHT = ')';

    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Stack bStack = new Stack();
        System.out.println(isBracket(string, bStack));
    }

    private static boolean isBracket(String string, Stack bStack) {
        boolean check = true;
        for (int i = 0; i < string.length(); i++) {
            Character temp = string.charAt(i);
            if (temp != BRACKET_LEFT && temp != BRACKET_RIGHT) {
                continue;
            } else if (BRACKET_RIGHT.equals(string.charAt(0)) || BRACKET_LEFT.equals(string.charAt(string.length() - 1))) {
                check = false;
                break;
            } else if (temp.equals(BRACKET_LEFT)) {
                bStack.push(temp);
                continue;
            } else if (temp.equals(BRACKET_RIGHT)) {
                if (!bStack.isEmpty()) {
                    bStack.pop();
                } else {
                    check = false;
                    break;
                }
            }
        }
        if (bStack.size() != 0) {
            check = false;
        }
        return check;
    }
}

