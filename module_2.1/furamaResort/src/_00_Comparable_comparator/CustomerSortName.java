package _00_Comparable_comparator;

import _01_models.Customer;

import java.util.Calendar;
import java.util.Comparator;

public class CustomerSortName implements Comparator<Customer> {
    @Override
    public int compare(Customer customer_1, Customer customer_2) {
        int result =  customer_1.getName().compareTo(customer_2.getName());
//        if(result == 0){
//            Calendar cal1 = Calendar.getInstance();
//            cal1.setTime(customer_1.getBirthday());
//            Calendar cal2 = Calendar.getInstance();
//            cal2.setTime(o.birthDay);
//
//            int month1 = cal1.get(Calendar.MONTH);
//            int month2 = cal2.get(Calendar.MONTH);
//
//            if(month1 < month2)
//                return -1;
//            else if(month1 == month2)
//                return cal1.get(Calendar.DAY_OF_MONTH) - cal2.get(Calendar.DAY_OF_MONTH);
//
//            else return 1;
//        }else
            return result;
    }
}
