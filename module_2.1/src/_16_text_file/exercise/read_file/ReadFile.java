package _16_text_file.exercise.read_file;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    public static final String COMMA = ",";
    public static final String PATH = "src/_16_text_file/exercise/data/filetest.csv";
    public  static List<String[]> readFile(String path) throws IOException {
        List<String[]> list = new LinkedList<>();
        BufferedReader bufferedReader = null;
        String line = "";
        try {
          bufferedReader = new BufferedReader(new FileReader(path));
          while ((line = bufferedReader.readLine()) != null){
              String[] holder = line.split(COMMA);
              list.add(holder);
          }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedReader.close();
        }
        return list;
    }
    public static void main(String[] args) throws IOException {
        List<String[]> list ;
        list = ReadFile.readFile(PATH);
        for (String[] string: list){
            System.out.println(Arrays.toString(string));
        }
    }
}
