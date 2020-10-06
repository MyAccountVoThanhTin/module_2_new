package _18_string_and_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String NAME_CLASS_REGEX = "^[CAP]+[\\w]*\\d{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            System.out.print("Enter your Name of class : ");
            str = scanner.nextLine();
        } while (!Pattern.compile(NAME_CLASS_REGEX).matcher(str).matches());
    }
}
