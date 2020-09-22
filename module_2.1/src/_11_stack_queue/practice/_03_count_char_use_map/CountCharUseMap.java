package _11_stack_queue.practice._03_count_char_use_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharUseMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = scanner.nextLine();
        System.out.println(string.toLowerCase());
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0;i < string.length();i++){
           char c = string.charAt(i);
           if(hm.containsKey(c)){
               int temp = hm.get(c);
               hm.put(c,++temp);
           }else {
               hm.put(c,1);
           }
        }
        System.out.println(hm.entrySet());
//        for (Map.Entry<Character, Integer> e : hm.entrySet())
//            System.out.println(e.getKey() + " "
//                    + e.getValue());
    }
}

