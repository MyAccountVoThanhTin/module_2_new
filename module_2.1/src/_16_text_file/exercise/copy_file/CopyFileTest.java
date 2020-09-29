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
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File(PATH));
            outStream = new FileOutputStream(new File(PATH1));

            int length;
            byte[] buffer = new byte[1024];
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();

        }
    }
}
