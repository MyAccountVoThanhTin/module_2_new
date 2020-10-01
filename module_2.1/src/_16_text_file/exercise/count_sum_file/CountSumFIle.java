package _16_text_file.exercise.count_sum_file;

import org.omg.PortableInterceptor.DISCARDING;

import java.io.*;
import java.util.InputMismatchException;

public class CountSumFIle {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int sum = 0;
        try{
            fileReader = new FileReader(new File("src/_16_text_file/exercise/data/fileNumber.txt"));
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                sum += Integer.parseInt(line);
            }
        }catch (FileNotFoundException e){

        }catch (InputMismatchException ex){

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedReader.close();
        }
        System.out.println("Tong la : "+sum);
    }
}
