package _08_clean_code.practice._01_change_variable_and_constant.practice;

public class Caculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand , int secondOperand , char operator ) {
        switch (operator ) {
            case ADDITION:
                return firstOperand  + secondOperand ;
            case SUBTRACTION:
                return firstOperand  - secondOperand ;
            case MULTIPLICATION:
                return firstOperand  * secondOperand ;
            case DIVISION:
                return check(firstOperand, secondOperand);
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    private static int check(int firstOperand, int secondOperand) {
        if (secondOperand  != 0)
            return firstOperand  / secondOperand ;
        else
            throw new RuntimeException("Can not divide by 0");
    }
}
