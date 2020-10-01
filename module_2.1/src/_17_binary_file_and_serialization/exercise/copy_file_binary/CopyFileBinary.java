package _17_binary_file_and_serialization.exercise.copy_file_binary;



import _17_binary_file_and_serialization.exercise.product.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileBinary {
    public static final String PATH_COPY = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_17_binary_file_and_serialization\\exercise\\copy_file_binary\\copyFileBinary";
    public static final String PATH = "D:\\CodeGym_VoThanhTin\\module_2_new\\module_2.1\\src\\_17_binary_file_and_serialization\\exercise\\data\\product.csv";

    private static void copyFileBinary(String source,String dis) throws IOException {
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream  = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File(source)));
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(dis)));
            objectOutputStream.writeObject(objectInputStream.readObject());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(objectInputStream != null){
                objectInputStream.close();
            }
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
    public static List<Product> readFile(String path) throws IOException {
        List<Product> list = new ArrayList<>();
        ObjectInputStream objectInputStream = null;
        try{
            objectInputStream = new ObjectInputStream(new FileInputStream(new File(path)));
            list = (ArrayList<Product>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }finally {
            if (objectInputStream != null){
                objectInputStream.close();
            }
        }

        return list;
    }
    public static void main(String[] args) throws IOException {
        copyFileBinary(PATH,PATH_COPY);
        for (Product product: (readFile(PATH_COPY))){
            System.out.println(product);
        }
    }
}
