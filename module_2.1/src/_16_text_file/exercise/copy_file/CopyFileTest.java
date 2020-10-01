package _16_text_file.exercise.copy_file;

import java.io.*;

public class CopyFileTest {
    public static void writeFile(String path, String line) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final static String PATH = "src/_16_text_file/exercise/data/filetest.csv";
    private final static String PATH1 = "src/_16_text_file/exercise/data/filetest1.csv";

    public static void main(String[] args) throws IOException {
        String line1 = "vothanhtin";
        String line2 = "codegym";
        String line3 = "danang";
        CopyFileTest.writeFile(PATH, line1);
        CopyFileTest.writeFile(PATH, line2);
        CopyFileTest.writeFile(PATH, line3);
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
             fileWriter = new FileWriter(new File(PATH1));
             bufferedWriter = new BufferedWriter(fileWriter);
             fileReader = new FileReader(new File(PATH));
             bufferedReader = new BufferedReader(fileReader);
             String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
            if(fileWriter == null){
                fileWriter.close();
            }
        }

    }
}
