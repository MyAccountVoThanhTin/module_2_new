package _0_project_furama_resort.exceptions;

public class BirthdayException extends Exception {

    public BirthdayException() {
        super("The birth year must be > 1900 and 18 years less than the current year, in correct format: dd/mm/yyyy");
    }
}
