package _17_binary_file_and_serialization.exercise.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String PATH = "src/_17_binary_file_and_serialization/exercise/data/product.csv";
    public static void main(String[] args) throws IOException {
        List<Product> list = new ArrayList<>();
        list.add(new Product("D","dia","samsung",35.000,"khong"));
        list.add(new Product("b","da","ss",25.000,"khong"));
        list.add(new Product("c","fa","gg",10.000,"khong"));
        list.add(new Product("e","ga","hh",5.000,"khong"));
        Menu.addProduct(list,PATH);
        List<Product> list1 =  new ArrayList<>();
        for (Product product : (list1 =  Menu.showProduct(PATH))){
            System.out.println(product);
        }
        System.out.println(Menu.find("A",PATH));
    }
}
