package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShowInformationCustomer {
    public static final String FILE_CUSTOMER = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_0_project_furama_resort\\_05_data\\Customer.csv";
    public void showInformationCustomer(){
        System.out.println("List customer is : ");
        List<Customer> list = listCustomer(FILE_CUSTOMER);
        Collections.sort(list,new CustomerSortByNameAndBirthday());
        for (Customer customer : list){
            customer.showInfo();
            System.out.println();
        }
    }

    private List<Customer> listCustomer(String path){
        List<Customer> listCustomer = new ArrayList<>();
        List<String> list = ReadWriteFile.readFile(path);
        String arr[];
        Customer customer = null;
        for (String listString: list){
            arr = listString.split(",");
            customer = new Customer();
            customer.setNameCustomer(arr[0]);
            customer.setBirthdayCustomer(arr[1]);
            customer.setGender(arr[2]);
            customer.setIdcardCustomer(arr[3]);
            customer.setNumberPhone(arr[4]);
            customer.setEmailCustomer(arr[5]);
            customer.setTypeCustomer(arr[6]);
            customer.setAddressCustomer(arr[7]);
            listCustomer.add(customer);
        }
        return listCustomer;
    }
}
