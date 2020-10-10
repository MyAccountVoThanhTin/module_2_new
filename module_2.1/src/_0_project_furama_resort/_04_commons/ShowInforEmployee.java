package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.Employee;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ShowInforEmployee {
    private static String FILE_EMPLOYEE = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Employee";
    Scanner scanner = new Scanner(System.in);

    public void showInforEmployee(){
        System.out.println("Input your choice : \n" +
                "1.Show information of Employee.\n" +
                "2.Add new Employee.");
        System.out.print("Please input your choice : ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                show();
                break;
            case 2:
                addEmployee(FILE_EMPLOYEE);
                break;
            default:
                System.out.println("Choice Again !");
                showInforEmployee();;
        }
    }

    private void show(){
        Map<String,Employee> listMap = listMap();
        for (Map.Entry<String,Employee> entry: listMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue().toString());
        }
    }

    private Map<String,Employee> listMap(){
        Map<String, Employee> listEmployee = new TreeMap<>();
        List<String> list = ReadWriteFile.readFile(FILE_EMPLOYEE);
        Employee employee;
        String[] arrEmployee;
        for (String listString: list){
            arrEmployee = listString.split(AddNewCustomer.COMMA);
            employee = new Employee();
            employee.setNameEmployee(arrEmployee[1]);
            employee.setAgeEmployee(Integer.parseInt(arrEmployee[2]));
            employee.setAddressEmployee(arrEmployee[3]);
            listEmployee.put(arrEmployee[0],employee);
        }
        return listEmployee;
    }

    private void addEmployee(String path){
        String line = idEmployee(path)+AddNewCustomer.COMMA+nameEmployee()+AddNewCustomer.COMMA+ageEmployee()+
                AddNewCustomer.COMMA+addressEmployee();
        ReadWriteFile.writeFile(path,line);
    }

    private String idEmployee(String path){
        scanner.nextLine();
        boolean flag = true;
        String id;
        do {
            flag = true;
            System.out.println("Input id of Employee : ");
            id = scanner.nextLine();
            if(!Validate.idEmployee(id)){
                flag = false;
                System.out.println("Input with format : 001-002-003");
            }else if(!AddNewServices.checkExist(path,0,id)){
                flag = false;
                System.out.println("ID is Exist !");
            }
        }while (!flag);
        return id;
    }

    private String nameEmployee(){
        System.out.println("Input name of Employee : ");
        return AddNewServices.capitalizeString(scanner.nextLine());
    }

    private int ageEmployee(){
        System.out.println("Input age of Employee : ");
        return scanner.nextInt();
    }

    private String addressEmployee(){
        scanner.nextLine();
        System.out.println("Input address of Employee : ");
        return scanner.nextLine();
    }
}
