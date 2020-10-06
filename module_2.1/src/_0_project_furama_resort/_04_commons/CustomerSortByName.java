package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.Customer;

import java.util.Comparator;

public class CustomerSortByName implements Comparator<Customer> {
    @Override
    public int compare(Customer cus1, Customer cus2) {
        return cus1.getNameCustomer().compareTo(cus2.getNameCustomer());
    }
}
