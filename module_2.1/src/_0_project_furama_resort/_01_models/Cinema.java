package _0_project_furama_resort._01_models;

import _06_extends.exercise._01_circle_and_cylinder.Circle;
import _0_project_furama_resort._04_commons.ReadWriteFile;

import java.sql.SQLOutput;
import java.util.*;

public class Cinema {
    Scanner scanner = new Scanner(System.in);
    private Queue<Customer> queue = new LinkedList<>();
    private int movieTickets;

    public Cinema() {
        this.totalTickets();
        this.menu();
    }

    public int getMovieTickets() {
        return movieTickets;
    }

    public void setMovieTickets(int movieTickets) {
        this.movieTickets = movieTickets;
    }

    private void totalTickets(){
        System.out.println("Input total Tickets today : ");
        setMovieTickets(scanner.nextInt());
    }

    public void add() {
        if (check()) {
            System.out.println("NOT any Tickets");
            this.show();
        } else {
            scanner.nextLine();
            System.out.println("Input id card of customer : ");
            String idcard = scanner.nextLine();
            List<String> list = ReadWriteFile.readFile("D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Customer.csv");
            String[] arr;
            Customer customer = new Customer();
            boolean flag = false;
            for (String listString : list) {
                arr = listString.split(",");
                if (idcard.equals(arr[3])) {
                    customer = setCustomer(arr);
                    queue.add(customer);
                    setMovieTickets(getMovieTickets() - 1);
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("Add success !");
            } else {
                System.out.println("ID card : " + idcard + " is NOT Exist !");
            }
        }
    }

    private Customer setCustomer(String[] stringCustomer){
        Customer customer = new Customer();
        customer.setNameCustomer(stringCustomer[0]);
        customer.setBirthdayCustomer(stringCustomer[1]);
        customer.setGender(stringCustomer[2]);
        customer.setIdcardCustomer(stringCustomer[3]);
        customer.setNumberPhone(stringCustomer[4]);
        customer.setEmailCustomer(stringCustomer[5]);
        customer.setTypeCustomer(stringCustomer[6]);
        customer.setAddressCustomer(stringCustomer[7]);
        return customer;
    }

    private boolean check(){
        System.out.println("Total Tickets today is : "+ getMovieTickets());
        if(getMovieTickets() > 0){
            return false;
        }
        return true;
    }

    private void show(){
        for (Customer cus: queue){
            System.out.println(cus.showInfo());
        }
    }

    private void menu(){
        int choice;
        do {
            System.out.println("Do you want movie ?\n" +
                    "1. Buy Ticket\n" +
                    "Press other to exit");
            System.out.println("Please ! Input your choice");
             choice = scanner.nextInt();
            if (choice == 1) {
                add();
            }
        }while (choice == 1);
        System.exit(0);
    }
}
