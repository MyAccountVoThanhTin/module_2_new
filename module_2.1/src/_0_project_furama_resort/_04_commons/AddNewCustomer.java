package _0_project_furama_resort._04_commons;

import _0_project_furama_resort.exceptions.*;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddNewCustomer {
    public static final String COMMA = ",";
    public static final String FILE_CUSTOMER = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Customer.csv";
    Scanner scanner = new Scanner(System.in);

    public AddNewCustomer() {
    }

    public void addNewCustomer() {
        String line = nameCustomer() + COMMA + birthdayCustomer() + COMMA + genderCustomer() + COMMA + idCustomer() + COMMA + numberphoneCustomer() +
                COMMA + emailCustomer() + COMMA + typeCustomer() + COMMA + addressCustomer();
        ReadWriteFile.writeFile(FILE_CUSTOMER, line);
    }

    boolean check;

    private String nameCustomer() {
        String name;
        do {
            check = true;
            System.out.println("Input name of customer : ");
            name = scanner.nextLine();
            try {
                Validate.nameCustomer(name);
            } catch (NameException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        return name;
    }

    private String birthdayCustomer() {
        String birthday;
        do {
            check = true;
            System.out.println("Input birthday of customer : ");
            birthday = scanner.nextLine();
            try {
                Validate.birthdayCustomer(birthday);
            } catch (BirthdayException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        return birthday;
    }

    private String genderCustomer() {
        String gender;
        do {
            System.out.println("Input gender of customer : ");
            gender = scanner.nextLine();
            try {
                Validate.genderException(gender);
            } catch (GenderException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        return AddNewServices.capitalizeString(gender);
    }

    private String idCustomer() {
        String id;
        do {
            check = true;
            System.out.println("Input id card of customer : ");
            id = scanner.nextLine();
            try {
                Validate.idCustomer(id);
            } catch (IdCardException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        return id;
    }

    private String numberphoneCustomer() {
        System.out.println("Input numberphone of customer : ");
        String numberphone = scanner.nextLine();
        return numberphone;
    }

    private String emailCustomer() {
        String email;
        do {
            System.out.println("Input email of customer : ");
            email = scanner.nextLine();
            try {
                Validate.emailCustomer(email);
            } catch (EmailException e) {
                check = false;
                e.printStackTrace();
            }
        } while (!check);
        return email;
    }

    private String typeCustomer() {
        System.out.println("Input type customer :  ");
        String typeCustomer = scanner.nextLine();
        return typeCustomer;
    }

    private String addressCustomer() {
        System.out.println("Input address of customer : ");
        String address = scanner.nextLine();
        return address;
    }
}
