package _03_controllers;

import _00_Comparable_comparator.CustomerSortName;
import _01_models.*;
import _04_commons.FileUtils;

import java.io.FileWriter;
import java.util.*;

public class MainController {
    public String id;
    public String name;
    public double area;
    public int cost;
    public int maxTotalPersons;
    public String typeRent;
    public String standardRoom;
    public String othersFacilities;
    public int floors;
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_SERVICES = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\furamaResort\\src\\_05_data\\services.csv";
    public static final String FILE_VILLA = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\furamaResort\\src\\_05_data\\villa.csv";
    public static final String FILE_HOUSE = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\furamaResort\\src\\_05_data\\house.csv";
    public static final String FILE_ROOM = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\furamaResort\\src\\_05_data\\room.csv";
    public static final String FILE_CUSTOMER = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\furamaResort\\src\\_05_data\\customer.csv";
    public static final String COMMAM = ",";

    public void displayMainMenu(List<Services> villa, List<Services> house, List<Services> room, List<Services> services, List<Customer> customers) {
        System.out.println("What do you want : " +
                "\n 1. Add New Services" +
                "\n 2.Show Services" +
                "\n 3.Add New Customer" +
                "\n 4.Show Information of Customer" +
                "\n 5.Add New Booking" +
                "\n 6.Show Information of Employee+" +
                "\n 7.Exit");
        System.out.println("Enter your choose : ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServices(villa, house, room, services,customers);
                displayMainMenu(villa, house, room, services,customers);
                break;
            case 2:
                showServices(villa, house, room, services,customers);
                displayMainMenu(villa, house, room, services,customers);
                break;
            case 3:
                addNewCustomer();
                Services holder = addObjectServices();
                Customer customer = new Customer(nameCustomer,birthdayCustomer,genderCustomer,idCardCustomer,numbersPhoneCustomer,emailCustomer, typeCustomer,addressCustomer,holder);
                customers.add(customer);
                String line = customer.getName()+COMMAM+customer.getBirthday()+COMMAM+
                        customer.getGender()+COMMAM+customer.getIdCard()+COMMAM+customer.getNumbersPhone()+
                        COMMAM+customer.getEmail()+COMMAM+customer.getTypeCustomer()+COMMAM+
                        customer.getAddress()+COMMAM+holder.getName();

                FileUtils.writeFile(FILE_CUSTOMER,line);
                displayMainMenu(villa, house, room, services, customers);
                break;
            case 4:
                showInformationCustomers();
                displayMainMenu(villa, house, room, services, customers);
                break;
            case 5:
                // addNewBooking();
                displayMainMenu(villa, house, room, services, customers);
                break;
            case 6:
                //showInformationCustomer();
                displayMainMenu(villa, house, room, services, customers);
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Choose again !");
                displayMainMenu(villa, house, room, services,customers);
        }
    }

    private void showInformationCustomers() {
        List<Customer> list = sortByName();
        for (Customer customer : list){
            System.out.println(customer+"\n");
        }

//        for (Customer customer2 : list){
//            System.out.println(customer2.toString()+"\n");
//        }
//        for (Customer customer2 : list){
//            System.out.println(Arrays.toString(list.toArray()) +"\n");
//        }
    }

    private List<Customer> sortByName() {
        List<String> listClone =  FileUtils.readFile(FILE_CUSTOMER);
        List<Customer> list  = new ArrayList<>();
        Customer customer;
        String[] arrCustomer;
        Services customer1 ;
        String nameServices = null;
        for (String lineCustomer : listClone){
            arrCustomer = lineCustomer.split(",");
            for (int i = 0;i < lineCustomer.length();i++) {
                nameServices = arrCustomer[8].toLowerCase();
            }
            if(nameServices.equals("villa")){
                customer1 = new Villa(null,nameServices,0.0d,0,0,null,null,null,0,0.0d);
            }else if(nameServices.equals("house")){
                customer1 = new House(null,nameServices,0.0d,0,0,null,null,null,0);
            }else {
                customer1 = new Room(null,nameServices,0.0d,0,0,null,null);
            }
            customer = new Customer(arrCustomer[0],arrCustomer[1],arrCustomer[2],Integer.parseInt(arrCustomer[3]),arrCustomer[4],arrCustomer[5],arrCustomer[6],arrCustomer[7],customer1);
            list.add(customer);
        }
        list.sort(new CustomerSortName());
        return list;
    }

    public void addNewServices(List<Services> villa, List<Services> house, List<Services> room, List<Services> services,List<Customer> customers) {
        int yourChoose;
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.println("Enter your choose : ");
        yourChoose = scanner.nextInt();
        switch (yourChoose) {
            case 1:
                addNew();
                addNew2();
                System.out.println("Please ! input poolArea : ");
                double poolArea1 = scanner.nextDouble();
                Villa villa1 = new Villa(id, name, area, cost, maxTotalPersons, typeRent, standardRoom, othersFacilities, floors, poolArea1);
                villa.add(villa1);
                services.add(villa1);
                String line =  villa1.getId() + COMMAM + villa1.getName() + COMMAM +  villa1.getArea() + COMMAM +
                        villa1.getCost() + COMMAM + villa1.getMaxTotalPersons() + COMMAM +
                       villa1.getTypeRent() + COMMAM +  villa1.getStandardRoom() + COMMAM +
                       villa1.getOthersFacilities() + COMMAM +  villa1.getFloors() + COMMAM +
                        villa1.getPoolArea();
                FileUtils.writeFile(FILE_VILLA, line);
                FileUtils.writeFile(FILE_SERVICES, line);
                break;
            case 2:
                addNew();
                addNew2();
                House house1 = new House(id, name, area, cost, maxTotalPersons, typeRent, standardRoom, othersFacilities, floors);
                house.add(house1);
                services.add(house1);
                String line1 =  house1.getId() +  COMMAM +  house1.getName() + COMMAM + house1.getArea() + COMMAM +
                   house1.getCost() + COMMAM +
                        house1.getMaxTotalPersons() + COMMAM + house1.getTypeRent() + COMMAM +
                        house1.getStandardRoom() + COMMAM +
                        house1.getOthersFacilities() + COMMAM +  house1.getFloors();
                FileUtils.writeFile(FILE_HOUSE, line1);
                FileUtils.writeFile(FILE_SERVICES, line1);
                break;
            case 3:
                addNew();
                System.out.println("Please ! input freeServices : ");
                String freeServices = scanner.nextLine();
                Room room1 = new Room(id, name, area, cost, maxTotalPersons, typeRent, freeServices);
                room.add(room1);
                services.add(room1);
                String line2 =  room1.getId() + COMMAM + room1.getName() + COMMAM + room1.getArea() + COMMAM + room1.getCost() + COMMAM +
                        room1.getMaxTotalPersons() + COMMAM +  room1.getTypeRent() + COMMAM + room1.getFreeServices();
                FileUtils.writeFile(FILE_ROOM, line2);
                FileUtils.writeFile(FILE_SERVICES, line2);
                break;
            case 4:
                displayMainMenu(villa, house, room, services,customers);
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Choose again !");
                addNewServices(villa, house, room, services,customers);
        }
    }

    public void addNew() {
        scanner.nextLine();
        System.out.println("Please ! input id type String: ");
        id = scanner.nextLine();
        System.out.println("Please ! input name type String: ");
        name = scanner.nextLine();
        System.out.println("Please ! input area type Double: ");
        area = scanner.nextDouble();
        System.out.println("Please ! input cost type Interger: ");
        cost = scanner.nextInt();
        System.out.println("Please ! input total's person type Interger : ");
        maxTotalPersons = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please ! input type rent type String: ");
        typeRent = scanner.nextLine();
    }

    public void addNew2() {
        System.out.println("Please ! input standardRoom type String: ");
        standardRoom = scanner.nextLine();
        System.out.println("Please ! input othersFacilities type String: ");
        othersFacilities = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Please ! input floors type Interger : ");
        floors = scanner.nextInt();
    }

    private void showServices(List<Services> villa, List<Services> house, List<Services> room, List<Services> services,List<Customer> customers) {
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit\n");
        System.out.println("Enter your choose :");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                List<String> listVilla = FileUtils.readFile(FILE_VILLA);
                for (String villa1 : listVilla) {
                    System.out.println(villa1 + "\n");
                }
                break;
            case 2:
                List<String> listHouse = FileUtils.readFile(FILE_HOUSE);
                for (String villa1 : listHouse) {
                    System.out.println(villa1 + "\n");
                }
                break;
            case 3:
                List<String> listRoom = FileUtils.readFile(FILE_ROOM);
                for (String room1 : listRoom) {
                    System.out.println(room1 + "\n");
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu(villa, house, room, services,customers);
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("Choose again !");
                showServices(villa, house, room, services,customers);
        }
    }

    private String nameCustomer;
    private String birthdayCustomer;
    private String genderCustomer;
    private int idCardCustomer;
    private String numbersPhoneCustomer;
    private String emailCustomer;
    private String typeCustomer;
    private String addressCustomer;
    private Services servicesCustomer;
    public void addNewCustomer(){
        scanner.nextLine();
        System.out.println("Input name of Customer : ");
        nameCustomer = scanner.nextLine();
        System.out.println("Input birthday of Customer : ");
        birthdayCustomer = scanner.nextLine();
        System.out.println("Input gender of Customer : ");
        genderCustomer = scanner.nextLine();
        System.out.println("Input id card of Customer : ");
        idCardCustomer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input numbers phone of Customer : ");
        numbersPhoneCustomer = scanner.nextLine();
        System.out.println("Input email of Customer : ");
        emailCustomer = scanner.nextLine();
        System.out.println("Input type customers of Customer : ");
        typeCustomer = scanner.nextLine();
        System.out.println("Input address of Customer : ");
        addressCustomer = scanner.nextLine();
    }
    public Services addObjectServices(){
        Services yourServices = null;
        System.out.println("what đo you want services ? " +
                "\n 1. Villa" +
                "\n 2. House" +
                "\n 3. Room");
        System.out.println("Enter your choose : ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                addNew();
                addNew2();
                System.out.println("Please ! input poolArea : ");
                double poolArea1 = scanner.nextDouble();
                yourServices = new Villa(id, name, area, cost, maxTotalPersons, typeRent, standardRoom, othersFacilities, floors, poolArea1);
                break;
            case 2:
                addNew();
                addNew2();
                yourServices = new House(id, name, area, cost, maxTotalPersons, typeRent, standardRoom, othersFacilities, floors);
                break;
            case 3:
                addNew();
                System.out.println("Please ! input freeServices : ");
                String freeServices = scanner.nextLine();
                yourServices = new Room(id, name, area, cost, maxTotalPersons, typeRent, freeServices);
                break;
            default:
                System.out.println("Enter your choose again !");
                addObjectServices();
        }
        return yourServices;
    }
}
