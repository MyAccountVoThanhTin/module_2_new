package _12_java_collection_framework.exercise.use_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product = new Product(8,"phim",50);
        Product product1 = new Product(1,"quan",1000);
        Product product2 = new Product(10,"chuong",40000);
        Product product3 = new Product(20,"ao",0);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(list,product);
        productManager.addProduct(list,product1);
        productManager.addProduct(list,product2);
        productManager.addProduct(list,product3);
        productManager.showProduct(list);
        System.out.println();
        System.out.println("Sort list :");
        Collections.sort(list,productManager);
        productManager.showProduct(list);
        System.out.println("Repair element of list : ");
        productManager.repairProduct(list,2);
        productManager.showProduct(list);
        System.out.println("Find in list : ");
        System.out.println( productManager.findProduct(list,"tin"));
        System.out.println("Delete elements : ");
        productManager.deleteProduct(list,0);
        productManager.showProduct(list);
    }
}
