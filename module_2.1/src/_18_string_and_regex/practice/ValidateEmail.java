package _18_string_and_regex.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static final String REGEX_EMAIL = "^[\\w]+@[\\w]+.com$";
  //public static final String REGEX_EMAIL ="^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    private static Pattern pattern;
    private Matcher matcher;
    public ValidateEmail() {
        pattern = Pattern.compile(REGEX_EMAIL);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();//matcher.find()
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ValidateEmail validateEmail = new ValidateEmail();
        String str;
        do {
            System.out.println("Enter your email : ");
             str = scanner.nextLine();
        }while (!validateEmail.validate(str));
        System.out.println("oke");
    }
}
