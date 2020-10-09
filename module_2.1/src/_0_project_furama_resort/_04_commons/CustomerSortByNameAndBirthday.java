package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.Customer;

import java.util.Comparator;

public class CustomerSortByNameAndBirthday implements Comparator<Customer> {
    @Override
    public int compare(Customer cus1, Customer cus2) {
        int result = cus1.getNameCustomer().compareTo(cus2.getNameCustomer());
        if(result == 0){
            int year1 = Integer.parseInt(cus1.getBirthdayCustomer().substring(cus1.getBirthdayCustomer().lastIndexOf("/")+1));
            int year2 = Integer.parseInt(cus2.getBirthdayCustomer().substring(cus2.getBirthdayCustomer().lastIndexOf("/")+1));
            if((year1 - year2) == 0){
                int month1 = Integer.parseInt(cus1.getBirthdayCustomer().substring(cus1.getBirthdayCustomer().indexOf("/")+1,
                        cus1.getBirthdayCustomer().lastIndexOf("/")));
                int month2 = Integer.parseInt(cus2.getBirthdayCustomer().substring(cus2.getBirthdayCustomer().indexOf("/")+1,
                        cus2.getBirthdayCustomer().lastIndexOf("/")));
                if((month1 - month2) == 0){
                    int day1 = Integer.parseInt(cus1.getBirthdayCustomer().substring(0,cus1.getBirthdayCustomer().indexOf("/")));
                    int day2 = Integer.parseInt(cus2.getBirthdayCustomer().substring(0,cus2.getBirthdayCustomer().indexOf("/")));
                    return day1 - day2;
                }
                return month1 - month2;
            }
            return year1 - year2;
        }
        return result;
    }
}
