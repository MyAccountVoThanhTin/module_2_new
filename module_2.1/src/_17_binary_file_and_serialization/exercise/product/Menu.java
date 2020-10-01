package _17_binary_file_and_serialization.exercise.product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void addProduct(List<Product> list, String path) throws IOException {
        ObjectOutputStream objectOutputStream = null;
        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(path)));
            objectOutputStream.writeObject(list);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
    public static List<Product> showProduct(String path){
        List<Product> list = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)));
            list = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean find(String id,String path){
        List<Product> list = showProduct(path);
        for (Product product: list){
            if(id.equals(product.getId())){
                return true;
            }
        }
        return false;
    }
}
