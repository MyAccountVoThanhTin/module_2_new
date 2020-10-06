package _18_string_and_regex.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static final String ACCOUNT_REGEX = "^[a-z0-9_]{6,}$";
    public boolean checkRegex(String regex){
        return Pattern.compile(ACCOUNT_REGEX).matcher(regex).matches();
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String account ;
        do {
            System.out.println("Enter yyour account : ");
            account = scanner.nextLine();

        }while (! new ValidateAccount().checkRegex(account));


    }
}
