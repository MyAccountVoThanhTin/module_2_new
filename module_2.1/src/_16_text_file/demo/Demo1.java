package _16_text_file.demo;

import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("simple message");
        System.err.println("error message");
        System.out.println("Enter a char in ASSCI :");
        int i=System.in.read();
        System.out.println(i);
    }
}
