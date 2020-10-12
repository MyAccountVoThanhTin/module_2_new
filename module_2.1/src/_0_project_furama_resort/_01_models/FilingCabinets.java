package _0_project_furama_resort._01_models;

import _0_project_furama_resort._04_commons.AddNewServices;
import _0_project_furama_resort._04_commons.ReadWriteFile;
import _16_text_file.exercise.read_file.ReadFile;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    private Stack<String[]> listEmployee = new Stack<>();
    Scanner scanner = new Scanner(System.in);

    public FilingCabinets() {
        List<String> list = ReadWriteFile.readFile("D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Employee");
        String[] arr1;
        for (String listString: list){
          arr1 = listString.split(",");
          listEmployee.push(arr1);
        }
    }

    private Employee setEmployee(String[] listString){
        Employee employee = new Employee();
        employee.setNameEmployee(listString[1]);
        employee.setAgeEmployee(Integer.parseInt(listString[2]));
        employee.setAddressEmployee(listString[3]);
        return employee;
    }

    public void searchEmployee(){
        System.out.println("Input id of Employee : ");
        String id = scanner.nextLine();
        Employee employee = new Employee();
        boolean flag =  false;
        for (String[] list: listEmployee){
            if(id.equals(list[0])){
              employee = setEmployee(list);
              flag = true;
              break;
            }
        }
        if(flag){
            System.out.println("Information Employee : "+employee.toString());
        }else {
            System.out.println("Employee with id: "+id+" is not Exist !");
        }
    }
}
