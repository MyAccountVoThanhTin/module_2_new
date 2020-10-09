package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.FreeService;
import _0_project_furama_resort._01_models.House;
import _0_project_furama_resort._01_models.Room;
import _0_project_furama_resort._01_models.Villa;
import _0_project_furama_resort._03_controllers.MainController;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class ShowServices {
    public static final String FILE_VILLA = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Villa.csv";
    public static final String FILE_HOUSE = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\House.csv";
    public static final String FILE_ROOM = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Room.csv";
    public static final String COMMA = ",";
    Scanner scanner = new Scanner(System.in);

    public void show() {
        System.out.println("Menu : \n" +
                "1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        System.out.print("Input your choice to show : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAll(FILE_VILLA);
                break;
            case 2:
                showAll(FILE_HOUSE);
                break;
            case 3:
                showAll(FILE_ROOM);
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
                new MainController().displayMainMenu();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("Input again your choice : ");
                show();
        }
    }

    public void showAll(String path) {
        List<String> list = ReadWriteFile.readFile(path);
        String[] arrlist;
        if (path.equals(FILE_VILLA)) {
            for (String listVilla : list) {
                arrlist = listVilla.split(COMMA);
                Villa villa = new Villa(arrlist[0], arrlist[1], Double.parseDouble(arrlist[2]), Double.parseDouble(arrlist[3]),
                        Integer.parseInt(arrlist[4]), arrlist[5], arrlist[6], arrlist[7], Double.parseDouble(arrlist[9]), Integer.parseInt(arrlist[8]));
                villa.showInfor();
                System.out.println();
            }
        } else if (path.equals(FILE_HOUSE)) {
            for (String listHouse : list) {
                arrlist = listHouse.split(COMMA);
                House house = new House(arrlist[0], arrlist[1], Double.parseDouble(arrlist[2]), Double.parseDouble(arrlist[3]),
                        Integer.parseInt(arrlist[4]), arrlist[5], arrlist[6], arrlist[7], Integer.parseInt(arrlist[8]));
                house.showInfor();
                System.out.println();
            }
        } else {
            for (String listRoom : list) {
                arrlist = listRoom.split(COMMA);
                FreeService freeService = new FreeService(arrlist[6], Integer.parseInt(arrlist[7]), Double.parseDouble(arrlist[8]));
                Room room = new Room(arrlist[0], arrlist[1], Double.parseDouble(arrlist[2]), Double.parseDouble(arrlist[3]),
                        Integer.parseInt(arrlist[4]), arrlist[5], freeService);
                room.showInfor();
                System.out.println();
            }
        }
    }

    private void showNameServices(String path){
        List<String> list = ReadWriteFile.readFile(path);
        Set<String> set = new TreeSet<>(list);
        for (String listName : list){
            set.add(listName.split(COMMA)[1]);
        }
        for (String listSet: set){
            System.out.println(listSet);
        }
    }
}
