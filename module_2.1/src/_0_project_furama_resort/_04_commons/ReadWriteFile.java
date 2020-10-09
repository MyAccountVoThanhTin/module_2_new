package _0_project_furama_resort._04_commons;

import _0_project_furama_resort._01_models.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String path, String line) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (EOFException ex) {
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        try {
            String line = "";
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (ArrayIndexOutOfBoundsException c) {
            c.getMessage();
        } catch (NullPointerException a) {
            a.getStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
