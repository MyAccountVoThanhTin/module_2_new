package _0_project_furama_resort._03_controllers;

import _0_project_furama_resort._01_models.*;
import _0_project_furama_resort._04_commons.ReadWriteFile;

import java.util.*;
import java.util.regex.Pattern;

public class MainController {
    public static final String NAME_SERVICES_REGEX = "^[A-Z]+[\\w]*$";
    public static final String ID_SERVICES_VILLA_REGEX = "^SVVL-[0-9]{4}";
    public static final String ID_SERVICES_HOUSE_REGEX = "^SVHO-[0-9]{4}";
    public static final String ID_SERVICES_ROOM_REGEX = "^SVRO-[0-9]{4}";
    public static final String NAME_FREE_SERVICES_REGEX = "[massage | karaoke | food | drink | car]";
    public static final String BIRTHDAY_CUSTOMER_REGEX = "\\d+\\d*/\\d+\\d*/\\d{4}";
    public static final String EREA_REGEX = "\\d+[.][\\d+]|\\d*";
    //public static final String AREA_USE_REGEX = "\\d+\\.?\\d*";
    private List<String> listIdServices = new ArrayList<>();
    private String idServices;
    private String nameServices;
    private double areaUseServices;
    private double rentCostServices;
    private int totalPerson;
    private String typeRent;
    private String standardRoom;
    private String otherFacilities;
    private int numberOfFloor;
    private String nameCustomer;
    private String birthdayCustomer;
    private String gender;
    private String idcardCustomer;
    private String numberPhone;
    private String emailCustomer;
    private String typeCustomer;
    private String addressCustomer;
    private Services services;
    public static final String COMMA = ",";
    public static final String FILE_VILLA = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Villa.csv";
    public static final String FILE_HOUSE = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\House.csv";
    public static final String FILE_ROOM = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Room.csv";
    public static final String FILE_CUSTOMER = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Customer.csv";
    Scanner scanner = new Scanner(System.in);

    private void displayMainMenu() {
        System.out.println("Enter your choose !\n" +
                "Menu : \n" +
                "1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServices();
                displayMainMenu();
                break;
            case 2:
                showServices();
                displayMainMenu();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                // showInformationCustomers();
                displayMainMenu();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Enter your choose again !");
                displayMainMenu();
        }
    }

//    private void showInformationCustomers() {
//        List<String> list = ReadWriteFile.readFile(FILE_CUSTOMER);
//        String[] arrlist;
//        List<Customer> customerList = new ArrayList<>();
//        for (String str : list) {
//            arrlist = str.split(COMMA);
//            Customer customer = new Customer(arrlist[0], arrlist[1], arrlist[2], arrlist[3], arrlist[4], arrlist[5], arrlist[6], arrlist[7],    );
//            customerList.add(customer);
//        }
//    }

    private void addNewCustomer() {
        scanner.nextLine();
        System.out.println("Input name of customer : ");
        nameCustomer = scanner.nextLine();
        nameCustomer = capitalizeString(nameCustomer);
        boolean check = false;
        do {
            System.out.println("Input birthday of customer : ");
            birthdayCustomer = scanner.nextLine();
            if (Pattern.compile(BIRTHDAY_CUSTOMER_REGEX).matcher(birthdayCustomer).matches()) {
                int day = Integer.parseInt(birthdayCustomer.substring(0, birthdayCustomer.indexOf("/")));
                int month = Integer.parseInt(birthdayCustomer.substring(birthdayCustomer.indexOf("/") + 1, birthdayCustomer.lastIndexOf("/")));
                int year = Integer.parseInt(birthdayCustomer.substring(birthdayCustomer.lastIndexOf("/") + 1));
                if ((day > 0 && day < 31) && (month > 0 && month < 13) && year > 0) {
                    check = true;
                }
            }
        } while (!check || !Pattern.compile(BIRTHDAY_CUSTOMER_REGEX).matcher(birthdayCustomer).matches());
        System.out.println("Input gender of customer : ");
        gender = scanner.nextLine();
        System.out.println("Input id card of customer : ");
        idcardCustomer = scanner.nextLine();
        System.out.println("Input number phone of customer : ");
        numberPhone = scanner.nextLine();
        System.out.println("Input email of customer : ");
        emailCustomer = scanner.nextLine();
        System.out.println("Input type's customer of customer : ");
        typeCustomer = scanner.nextLine();
        System.out.println("Input address of customer : ");
        addressCustomer = scanner.nextLine();
        System.out.println("Choose services [1.villa or 2.house or 3.room ]");
        int choose = scanner.nextInt();
        String line = null;
        switch (choose) {
            case 1:
                Villa villa = (Villa) chooseServices(choose);
                line = nameCustomer + COMMA + birthdayCustomer + COMMA + gender + COMMA + idcardCustomer + COMMA + numberPhone + COMMA + emailCustomer +
                        COMMA + typeCustomer + COMMA + addressCustomer + COMMA + villa.getNameServices();
                break;
            case 2:
                House house = (House) chooseServices(choose);
                line = nameCustomer + COMMA + birthdayCustomer + COMMA + gender + COMMA + idcardCustomer + COMMA + numberPhone + COMMA + emailCustomer +
                        COMMA + typeCustomer + COMMA + addressCustomer + COMMA + house.getNameServices();
                break;
            case 3:
                Room room = (Room) chooseServices(choose);
                line = nameCustomer + COMMA + birthdayCustomer + COMMA + gender + COMMA + idcardCustomer + COMMA + numberPhone + COMMA + emailCustomer +
                        COMMA + typeCustomer + COMMA + addressCustomer + COMMA + room.getNameServices();
                break;
        }
        ReadWriteFile.writeFile(FILE_CUSTOMER, line);
    }

    private Services chooseServices(int choose) {
        Services services = null;
        switch (choose) {
            case 1:
                addPropertyOfServices(ID_SERVICES_VILLA_REGEX);
                addProertyVillaHouse();
                System.out.println("Input pool's area : ");
                double pool = scanner.nextDouble();
                services = new Villa(idServices, nameServices, areaUseServices, rentCostServices, totalPerson, typeRent, standardRoom,
                        otherFacilities, pool, numberOfFloor);
                break;
            case 2:
                addPropertyOfServices(ID_SERVICES_HOUSE_REGEX);
                addProertyVillaHouse();
                services = new House(idServices, nameServices, areaUseServices, rentCostServices, totalPerson, typeRent, standardRoom,
                        otherFacilities, numberOfFloor);
                break;
            case 3:
                addPropertyOfServices(ID_SERVICES_ROOM_REGEX);
                FreeService freeService = addPropertyFreeServices();
                services = new Room(idServices, nameServices, areaUseServices, rentCostServices, totalPerson, typeRent, freeService);
                break;
            default:
                System.out.println("Choose again [1-3]");
                chooseServices(choose);
        }
        return services;
    }

    private void addNewServices() {
        System.out.println("Enter your choose's Services !\n" +
                "Menu : \n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addPropertyOfServices(ID_SERVICES_VILLA_REGEX);
                addProertyVillaHouse();
                boolean check = false;
                double poolArea;
                String area;
                do {
                    System.out.println("Enter area of pool : ");
                    area = scanner.nextLine();
                    if (Pattern.compile(EREA_REGEX).matcher(area).matches()) {
                        if (Double.parseDouble(area) > 30) {
                            check = true;
                        }
                    } else {
                        System.out.println("Input pool's area more than 30 and is a final number !");
                    }
                } while (!check);
                poolArea = Double.parseDouble(area);
                String line;
                line = idServices + COMMA + nameServices + COMMA + areaUseServices + COMMA + rentCostServices + COMMA + totalPerson +
                        COMMA + typeRent + COMMA + standardRoom + COMMA + otherFacilities + COMMA + poolArea + COMMA + numberOfFloor;
                ReadWriteFile.writeFile(FILE_VILLA, line);
                displayMainMenu();
                break;
            case 2:
                addPropertyOfServices(ID_SERVICES_HOUSE_REGEX);
                addProertyVillaHouse();
                String line1;
                line1 = idServices + COMMA + nameServices + COMMA + areaUseServices + COMMA + rentCostServices + COMMA + totalPerson + COMMA +
                        typeRent + COMMA + standardRoom + COMMA + otherFacilities + COMMA + numberOfFloor;
                ReadWriteFile.writeFile(FILE_HOUSE, line1);
                displayMainMenu();
                break;
            case 3:
                addPropertyOfServices(ID_SERVICES_ROOM_REGEX);
                String line2;
                FreeService freeService = addPropertyFreeServices();
                line2 = idServices + COMMA + nameServices + COMMA + areaUseServices + COMMA + rentCostServices + COMMA + totalPerson + COMMA +
                        typeRent + COMMA + freeService.getNameFreeService() + COMMA + freeService.getUnit() + COMMA + freeService.getCostFreeService();
                ReadWriteFile.writeFile(FILE_ROOM, line2);
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Choose again !");
                addNewServices();
        }
    }

    private FreeService addPropertyFreeServices() {
        String nameFreeServices;
        do {
            System.out.println("Enter name of free services : ");
            nameFreeServices = scanner.nextLine();
            nameFreeServices.toLowerCase();
            if (!Pattern.compile(NAME_FREE_SERVICES_REGEX).matcher(nameFreeServices).matches()) {
                System.out.println("Enter name type [massage or karaoke or food or drink or car]");
            }
        } while (!Pattern.compile(NAME_FREE_SERVICES_REGEX).matcher(nameFreeServices).matches());
        System.out.println("Enter unit : ");
        int unit = scanner.nextInt();
        System.out.println("Enter cost : ");
        double cost = scanner.nextDouble();

        return new FreeService(nameFreeServices, unit, cost);
    }

    private void addPropertyOfServices(String regex) {
        boolean check = false;
        scanner.nextLine();
        do {
            if (regex.equals(ID_SERVICES_VILLA_REGEX)) {
                System.out.println(" VD: SVVL-YYYY YYYY is a numbers !");
            } else if (regex.equals(ID_SERVICES_HOUSE_REGEX)) {
                System.out.println(" VD: SVHO-YYYY YYYY is a numbers !");
            } else {
                System.out.println(" VD: SVRO-YYYY YYYY is a numbers !");
            }
            System.out.println("Enter id of services : ");
            idServices = scanner.nextLine();
            if (Pattern.compile(regex).matcher(idServices).matches()) {
                if (listIdServices.isEmpty()) {
                    check = true;
                    break;
                }else {
                    for (String list : listIdServices) {
                        if (!(idServices.equals(list))) {
                            check = true;
                        }else {
                            check = false;
                            break;
                        }
                    }
                }
            }
        } while (!check);
        check = false;
        listIdServices.add(idServices);
        do {
            System.out.println("Enter name of services : ");
            nameServices = scanner.nextLine();
            if (!Pattern.compile(NAME_SERVICES_REGEX).matcher(nameServices).matches()) {
                System.out.println("Enter name with char(0) is UPPER CASE ! " +
                        "VD : Tin");
            }
        } while (!Pattern.compile(NAME_SERVICES_REGEX).matcher(nameServices).matches());
        nameServices = capitalizeString(nameServices);
        String areaUseServicesTest;
        do {
            System.out.println("Enter area use of services : ");
            areaUseServicesTest = scanner.nextLine();
            if (Pattern.compile(EREA_REGEX).matcher(areaUseServicesTest).matches()) {
                if (Double.parseDouble(areaUseServicesTest) > 30) {
                    check = true;
                } else {
                    System.out.println("Input area use more than 30 and is a final number !");
                }
            }
        } while (!check);
        check = false;
        areaUseServices = Double.parseDouble(areaUseServicesTest);
        do {
            System.out.println("Enter cost of services : ");
            rentCostServices = scanner.nextDouble();
            if (rentCostServices < 0) {
                System.out.println("Rent must positive numbers !");
            }
        } while (rentCostServices < 0);
        do {
            System.out.println("Enter total person : ");
            totalPerson = scanner.nextInt();
            if (totalPerson < 0 || totalPerson > 20) {
                System.out.println("Rent must positive numbers and less than 20!");
            }
        } while (totalPerson < 0 || totalPerson > 20);
        scanner.nextLine();
        do {
            System.out.println("Enter type of room : ");
            typeRent = scanner.nextLine();
            if (!Pattern.compile(NAME_SERVICES_REGEX).matcher(typeRent).matches()) {
                System.out.println("Enter Type Rent with char(0) is UPPER CASE ! " +
                        "VD : Tin");
            }
        } while (!Pattern.compile(NAME_SERVICES_REGEX).matcher(typeRent).matches());
    }

    /**
     * private String standardRoom;
     * private String otherFacilities;
     * private int numberOfFloor;
     */
    private void addProertyVillaHouse() {
        // scanner.nextLine();
        do {
            System.out.println("Enter standard of room : ");
            standardRoom = scanner.nextLine();
            if (!Pattern.compile(NAME_SERVICES_REGEX).matcher(standardRoom).matches()) {
                System.out.println("Enter Standard Room with char(0) is UPPER CASE ! " +
                        "VD : Tin");
            }
        } while (!Pattern.compile(NAME_SERVICES_REGEX).matcher(standardRoom).matches());
        standardRoom = capitalizeString(standardRoom);
        // scanner.nextLine();
        System.out.println("Enter other facilities : ");
        otherFacilities = scanner.nextLine();
        do {
            System.out.println("Enter number of floor : ");
            numberOfFloor = scanner.nextInt();
            if (numberOfFloor < 0) {
                System.out.println("Floor must positive numbers !");
            }
        } while (numberOfFloor < 0);
    }

    public void showServices() {
        System.out.println("Enter your choose ! \n" +
                "Menu : \n" +
                "1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                List<String[]> villa = showAllServices(FILE_VILLA);
                for (String[] str : villa) {
                    if (str.length > 0) {
                        new Villa(str[0], str[1], Double.parseDouble(str[2]), Double.parseDouble(str[3]), Integer.parseInt(str[4]),
                                str[5], str[6], str[7], Double.parseDouble(str[8]), Integer.parseInt(str[9])).showInfor();
                    }
//                    else {
//                        continue;
//                    }
                }
                System.out.println();
                break;
            case 2:
                List<String[]> house = showAllServices(FILE_HOUSE);
                for (String[] str : house) {
                    new House(str[0], str[1], Double.parseDouble(str[2]), Double.parseDouble(str[3]), Integer.parseInt(str[4]),
                            str[5], str[6], str[7], Integer.parseInt(str[8])).showInfor();
                }
                System.out.println();
                break;
            case 3:
                List<String[]> room = showAllServices(FILE_ROOM);
                for (String[] str : room) {
                    new Room(str[0], str[1], Double.parseDouble(str[2]), Double.parseDouble(str[3]), Integer.parseInt(str[4]),
                            str[5], new FreeService(str[6], Integer.parseInt(str[7]), Double.parseDouble(str[8]))).showInfor();
                }
                System.out.println();
                break;
            case 4:
                showNameServices(FILE_VILLA);
                break;
            case 5:
                showNameServices(FILE_HOUSE);
                break;
            case 6:
                showNameServices(FILE_ROOM);
                break;
            case 7:
                showServices();
                break;
            case 8:
                System.exit(0);
        }
    }

    public List<String[]> showAllServices(String path) {
        List<String> list = ReadWriteFile.readFile(path);
        List<String[]> arrList = new ArrayList<>();
        //  String[] arr ;
        for (String listString : list) {
            //arr = listString.split(COMMA);
            arrList.add(listString.split(COMMA));
        }
        return arrList;
    }

    public void showNameServices(String path) {
        List<String> list = ReadWriteFile.readFile(path);
        Set<String> set = new TreeSet<>();
        for (String listString : list) {
            set.add((listString.split(COMMA))[1]);
        }
        for (String set1 : set) {
            System.out.println(set1);
        }
    }


    public static String capitalizeString(String str) {
        char[] chars = str.trim().toLowerCase().toCharArray();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i]) && Character.isWhitespace(chars[i + 1])) {
                continue;
            }
            if (i == 0 || Character.isWhitespace(chars[i - 1])) {
                name.append((Character.toUpperCase(chars[i])));
                continue;
            }
            name.append((chars[i]));
        }
        return name.toString();
    }

    public static void main(String[] args) {
        new MainController().displayMainMenu();
        Scanner scanner = new Scanner(System.in);
//        String typeRent;
//        do {
//            System.out.println("Enter type of room : ");
//            typeRent = scanner.nextLine();
//            typeRent.toLowerCase();
//        } while (!Pattern.compile("[\\d]{2}/\\d{2}/\\d{4}").matcher(typeRent).matches());
//        int day = 0,month = 0,year = 0;
//        boolean check = false;
//        String str = null;
//        do {
//            System.out.println("Str : ");
//             str =  scanner.nextLine();
//            if(Pattern.compile(BIRTHDAY_CUSTOMER_REGEX).matcher(str).matches()) {
//                day = Integer.parseInt(str.substring(0, str.indexOf("/")));
//                System.out.println(day);
//                month = Integer.parseInt(str.substring(str.indexOf("/") + 1, str.lastIndexOf("/")));
//                System.out.println(month);
//                year = Integer.parseInt(str.substring(str.lastIndexOf("/") + 1));
//                System.out.println(year);
//                if(day < 32 && month < 13 && year > 0){
//                    check = true;
//                }
//            }
//        }while (!check || !Pattern.compile(BIRTHDAY_CUSTOMER_REGEX).matcher(str).matches());
//        System.out.println(day);
//        System.out.println(month);
//        System.out.println(year);
//        System.out.println(str);
//        String area;
//        boolean check = false;
//        do {
//            System.out.println("enter area: ");
//            area = scanner.nextLine();
//            if(Pattern.compile("\\d+[.][\\d+]|\\d*").matcher(area).matches()){
//                    if(Double.parseDouble(area) < 30){
//                        check = true;
//                    }
//            }else {
//                System.out.println("Input area more than 30 and is a final number!");
//            }
//        }while (!check);
//        System.out.println("oke");
    }
}
