package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.*;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AddNewBooking {
    public static String FILE_BOOKING = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Booking";
    private int choiceCustomer;
    private int indexServicesBooking;
    Scanner scanner = new Scanner(System.in);
    public void addNewBooking(){
        new ShowInformationCustomer().showInformationCustomer();
        System.out.println("Input customer want booking : ");
        choiceCustomer = scanner.nextInt();
        System.out.println("Input your choice \n" +
                "1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
        System.out.println("Choice Services to booking :");
        int choice = scanner.nextInt();
        System.out.println("List : ");
        switch (choice){
            case 1:
                new ShowServices().showAll(ShowServices.FILE_VILLA);
                System.out.println("Choice index want booking : ");
                indexServicesBooking = scanner.nextInt();
                writeFileBooking(FILE_BOOKING,updateCustomer(updateVilla(indexServicesBooking)));
                break;
            case 2:
                new ShowServices().showAll(ShowServices.FILE_HOUSE);
                System.out.println("Choice index want booking : ");
                indexServicesBooking = scanner.nextInt();
                writeFileBooking(FILE_BOOKING,updateCustomer(updateHouse(indexServicesBooking)));
                break;
            case 3:
                new ShowServices().showAll(ShowServices.FILE_ROOM);
                System.out.println("Choice index want booking : ");
                indexServicesBooking = scanner.nextInt();
                writeFileBooking(FILE_BOOKING,updateCustomer(updateRoom(indexServicesBooking)));
                break;
            default:
                System.out.println("Choice Again !");
                addNewBooking();
        }
    }

    private Villa updateVilla(int choiceServices) {
        List<String> list = ReadWriteFile.readFile(ShowServices.FILE_VILLA);
        String[] arr = list.get(choiceServices - 1).split(AddNewCustomer.COMMA);
        Villa villa = new Villa();
        villa.setIdServices(arr[0]);
        villa.setNameServices(arr[1]);
        villa.setAreaUseServices(Double.parseDouble(arr[2]));
        villa.setRentCostServices(Double.parseDouble(arr[3]));
        villa.setTotalPerson(Integer.parseInt(arr[4]));
        villa.setTypeRent(arr[5]);
        villa.setStandardRoom(arr[6]);
        villa.setOrtherFacilities(arr[7]);
        villa.setPoolArea(Double.parseDouble(arr[8]));
        villa.setNumberOfFloor(Integer.parseInt(arr[9]));
        return villa;
    }

    private House updateHouse(int choiceServices) {
        List<String> list = ReadWriteFile.readFile(ShowServices.FILE_HOUSE);
        String[] arr = list.get(choiceServices - 1).split(AddNewCustomer.COMMA);
        House house = new House();
        house.setIdServices(arr[0]);
        house.setNameServices(arr[1]);
        house.setAreaUseServices(Double.parseDouble(arr[2]));
        house.setRentCostServices(Double.parseDouble(arr[3]));
        house.setTotalPerson(Integer.parseInt(arr[4]));
        house.setTypeRent(arr[5]);
        house.setStandardRoom(arr[6]);
        house.setOrtherFacilities(arr[7]);
        house.setNumberOfFloor(Integer.parseInt(arr[8]));
        return house;
    }

    private Room updateRoom(int choiceServices) {
        List<String> list = ReadWriteFile.readFile(ShowServices.FILE_ROOM);
        String[] arr = list.get(choiceServices - 1).split(AddNewCustomer.COMMA);
        FreeService freeService = new FreeService(arr[6],Integer.parseInt(arr[7]),Double.parseDouble(arr[8]));
        Room room = new Room();
        room.setIdServices(arr[0]);
        room.setNameServices(arr[1]);
        room.setAreaUseServices(Double.parseDouble(arr[2]));
        room.setRentCostServices(Double.parseDouble(arr[3]));
        room.setTotalPerson(Integer.parseInt(arr[4]));
        room.setTypeRent(arr[5]);
        room.setFreeServices(freeService);
        return room;
    }

    private Customer updateCustomer(Services services){
        List<String> list = ReadWriteFile.readFile(AddNewCustomer.FILE_CUSTOMER);
        String[] arr = list.get(choiceCustomer -1 ).split(AddNewCustomer.COMMA);
        Customer customer = new Customer();
        customer.setNameCustomer(arr[0]);
        customer.setBirthdayCustomer(arr[1]);
        customer.setGender(arr[2]);
        customer.setIdcardCustomer(arr[3]);
        customer.setNumberPhone(arr[4]);
        customer.setEmailCustomer(arr[5]);
        customer.setTypeCustomer(arr[6]);
        customer.setAddressCustomer(arr[7]);
        customer.setServices(services);
        return customer;
    }

    private void writeFileBooking(String path,Customer customer){
        ReadWriteFile.writeFile(path,customer.showInfo());
    }
}
