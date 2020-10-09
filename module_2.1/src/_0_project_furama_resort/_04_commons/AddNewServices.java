package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._03_controllers.MainController;

import java.util.List;
import java.util.Scanner;

public class AddNewServices {
    private static String COMMA = ",";
    private static final String FILE_VILLA = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Villa.csv";
    private static final String FILE_HOUSE = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\House.csv";
    private static final String FILE_ROOM = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Room.csv";
    Scanner scanner = new Scanner(System.in);
    int choose;

    public AddNewServices() {
    }

    public void addNewServices() {
        System.out.println("Menu : \n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.print("Choose : ");
        int choice = scanner.nextInt();
        choose = chooseServices();
        String line;
        switch (choice) {
            case 1:
                line = lineServices() + COMMA + lineVillaHouse() + COMMA + poolArea();
                ReadWriteFile.writeFile(FILE_VILLA, line);
                break;
            case 2:
                line = lineServices() + COMMA + lineVillaHouse();
                ReadWriteFile.writeFile(FILE_HOUSE, line);
                break;
            case 3:
                line = lineServices() + COMMA + lineServicesFree();
                ReadWriteFile.writeFile(FILE_ROOM, line);
                break;
            case 4:
                new MainController().displayMainMenu();
            case 5:
                System.exit(0);
            default:
                chooseServices();
                addNewServices();
        }
    }

    private String lineServices() {
        return idServices() + COMMA + nameServices() + areaUseServices() + COMMA + rentCost() + COMMA + totalPerson() + COMMA + typeRentServices();
    }

    private String lineVillaHouse() {
        return standardRoom() + COMMA + otherFacilities() + COMMA + numberOfFloor();
    }

    private String lineServicesFree() {
        return nameFreeServices() + COMMA + unitServicesFree() + COMMA + costServicesFree();
    }

    private int chooseServices() {
        System.out.println("Choose services : \n" +
                "1.Villa\t" +
                "2.House\t" +
                "3.Room");
        return scanner.nextInt();
    }

    private String idServices() {
        scanner.nextLine();
        System.out.println("Input id with format: [SVVL-1234 || SVHO-1234 || SVRO-1234]");
        System.out.println("Input id of Customer : ");
        String id = scanner.nextLine();
        if ((Validate.idServices(id, choose))) {
            if (choose == 1) {
                if (!(checkExist(FILE_VILLA, 0, id))) {
                    System.out.println("ID is Exist");
                    idServices();
                }
            } else if (choose == 2) {
                if (!(checkExist(FILE_HOUSE, 0, id))) {
                    System.out.println("ID is Exist");
                    idServices();
                }
            } else if (choose == 3) {
                if (!(checkExist(FILE_ROOM, 0, id))) {
                    System.out.println("ID is Exist");
                    idServices();
                }
            }
            return id;
        } else {
            System.out.println("Fail format !");
            idServices();
        }
        return id;
    }

    private String nameServices() {
        System.out.println("Input name of Services : ");
        String nameServices = scanner.nextLine();
        if (!(Validate.nameServices(nameServices))) {
            System.out.println("Input name of services with char(0) is UPPER CASE !");
            nameServices();
        }
        return capitalizeString(nameServices);
    }

    private double areaUseServices() {
        System.out.println("Input area use of Services : ");
        String area = scanner.nextLine();
        if (!(Validate.areaUse(area))) {
            System.out.println("Input area use of services right format and more than 30 !");
            areaUseServices();
        }
        return Double.parseDouble(area);
    }

    private double rentCost() {
        System.out.println("Input cost for rent : ");
        double rentCost = scanner.nextDouble();
        if (rentCost < 0) {
            rentCost();
        }
        return rentCost;
    }

    private int totalPerson() {
        System.out.println("Input total's person : ");
        int total = scanner.nextInt();
        if (total < 0 || total > 20) {
            totalPerson();
        }
        return total;
    }

    private String typeRentServices() {
        System.out.println("Input rent's type : ");
        String typeRent = scanner.nextLine();
        if (!(Validate.nameServices(typeRent))) {
            System.out.println("Input rent's type with char(0) is UPPER CASE !");
            typeRentServices();
        }
        return typeRent;
    }

    private String standardRoom() {
        System.out.println("Input Room's standard : ");
        String standardRoom = scanner.nextLine();
        if (!(Validate.nameServices(standardRoom))) {
            System.out.println("Input Room's standard with char(0) is UPPER CASE !");
            standardRoom();
        }
        return standardRoom;
    }

    private String otherFacilities() {
        System.out.println("Enter other facilities : ");
        return scanner.nextLine();
    }

    private int numberOfFloor() {
        System.out.println("Enter number of floor : ");
        int numberOfFloor = scanner.nextInt();
        if (numberOfFloor < 0) {
            numberOfFloor();
        }
        return numberOfFloor;
    }

    private double poolArea() {
        System.out.println("Enter area of pool : ");
        String area = scanner.nextLine();
        if (!(Validate.areaUse(area))) {
            System.out.println("Input pool area of services right format and more than 30 !");
            poolArea();
        }
        return Double.parseDouble(area);
    }

    private String nameFreeServices() {
        System.out.println("Enter name of Services's free : ");
        String name = scanner.nextLine();
        if (!(Validate.nameFreeService(name))) {
            System.out.println("Input name [massage || karaoke || food || drink || car] !");
            nameFreeServices();
        }
        return name;
    }

    private int unitServicesFree() {
        System.out.println("Input unit of Services's free: ");
        int unit = scanner.nextInt();
        if (unit < 0) {
            unitServicesFree();
        }
        return unit;
    }

    private double costServicesFree() {
        System.out.println("Input cost of Services's free: ");
        double cost = scanner.nextDouble();
        if (cost < 0) {
            costServicesFree();
        }
        return cost;
    }

    public static boolean checkExist(String path, int index, String value) {
        List<String> list = ReadWriteFile.readFile(path);
        String[] listArray;
        for (String listCheck : list) {
            listArray = listCheck.split(COMMA);
            if (listArray[index].equals(value)) {
                return false;
            }
        }
        return true;
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
}
