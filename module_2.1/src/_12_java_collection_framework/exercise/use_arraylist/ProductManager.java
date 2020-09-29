package _12_java_collection_framework.exercise.use_arraylist;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ProductManager implements Comparator<Product> {
    Scanner scanner = new Scanner(System.in);
    public void addProduct(List<Product> arrayList,Product e){
        arrayList.add(e);
    }

    public void repairProduct(List<Product> list,int index){
        Product temp = list.get(index);
        System.out.println("Do you want repair id or name or cost :" +
                "\n 1. id" +
                "\n 2. name" +
                "\n 3. cost");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("Enter orther id : ");
                int newId = scanner.nextInt();
                temp.setIdProduct(newId);
                list.add(index,temp);
                list.remove(index);
                break;
            case 2:
                System.out.println("Enter orther name : ");
                String newName = scanner.nextLine();
                temp.setNameProduct(newName);
                list.add(index,temp);
                list.remove(index);
                break;
            case 3:
                break;
            default: repairProduct(list,index);
        }
    }

    public void deleteProduct(List<Product> arrayList,int index){
            arrayList.remove(index);
    }

    public void showProduct(List<Product> list){
        System.out.println("Do you want Show All element or index :" +
                "\n 1. Show all" +
                "\n Orthers to show index :");
        int choose = scanner.nextInt();
        if(choose == 1){
            for (Product product : list){
                System.out.println(product.toString());
            }
        }else {
            System.out.println("Enter index :");
            int index = scanner.nextInt();
            System.out.println( list.get(index).toString());

        }
    }

    public boolean findProduct(List<Product> list,String name){
        Iterator interator = list.iterator();
        while (interator.hasNext()){
            Product product = (Product) interator.next();
            if(product.getNameProduct().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getIdProduct() > o2.getIdProduct()) {
            return 1;
        } else if (o1.getIdProduct() == o2.getIdProduct()) {
            return 0;
        } else {
            return -1;
        }
    }
}
