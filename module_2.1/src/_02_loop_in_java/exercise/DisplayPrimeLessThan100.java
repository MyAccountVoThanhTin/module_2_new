package _02_loop_in_java.exercise;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        int i=1;
        while (i < 100){
            i += 1;
            if(i == 2){
                System.out.println(i);
                continue;
            }else {
                boolean check = true;
                for (int j = 2 ;j < i ;j++){
                    if(i % j == 0){
                        check = false;
                        break;
                    }else {
                        check = true;
                    }
                }
                if (check){
                    System.out.println(i);
                    continue;
                }
            }
        }
    }
}
