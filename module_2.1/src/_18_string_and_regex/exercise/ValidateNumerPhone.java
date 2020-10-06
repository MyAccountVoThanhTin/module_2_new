package _18_string_and_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNumerPhone {
    private static final String NUMBER_PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            System.out.print("Enter your numberphone : ");
            str = scanner.nextLine();
        } while (! Pattern.compile(NUMBER_PHONE_REGEX).matcher(str).matches());
    }
}
