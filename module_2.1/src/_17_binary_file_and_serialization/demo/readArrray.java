package _17_binary_file_and_serialization.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class readArrray {
    public static void main(String[] args) throws IOException {
        int[] arr = {2,3,5,7,11};
        DataOutputStream dataOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
             fileOutputStream = new FileOutputStream("src/_17_binary_file_and_serialization/demo/fileInt",false);
             dataOutputStream = new DataOutputStream(fileOutputStream);
            for (int i = 0 ;i < arr.length;i++){
                dataOutputStream.writeInt(arr[i]);
            }
          //  dataOutputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            dataOutputStream.close();
        }
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        List<Integer> list = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("src/_17_binary_file_and_serialization/demo/fileInt");
            dataInputStream = new DataInputStream(fileInputStream);
            while (true) {
                try {
                    list.add(dataInputStream.readInt());
                } catch (EOFException e) {
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            dataInputStream.close();
        }
       for (Integer integer : list){
           System.out.print(integer+"\n");
       }
    }
}
