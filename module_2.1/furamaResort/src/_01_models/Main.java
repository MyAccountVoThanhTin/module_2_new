package _01_models;

import _03_controllers.MainController;
import _04_commons.FileUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Services> services = new ArrayList<>();
        List<Services> villa = new ArrayList<>();
        List<Services> house = new ArrayList<>();
        List<Services> room = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        MainController mainController = new MainController();
        mainController.displayMainMenu(villa,house,room,services,customers);
//        List<String> listClone =  FileUtils.readFile(MainController.FILE_CUSTOMER);
//        for (String list : listClone){
//            System.out.println(list+"\n");
//        }


//        String line = null;
//        for (Services services1 : services){
//            line = services1.toString();
//            FileUtils.writeFile(FILE_NAME,line);
//        }
//        String test = "tin,18/01/1997,nam,212580306,0985281614,vtt18011997@gmail.com,vip,nguyedinhchieu,villa";
//        String[] strings = new String[test.length()];
//        strings = test.split(",");
//        System.out.println(strings[8]);
    }
}
