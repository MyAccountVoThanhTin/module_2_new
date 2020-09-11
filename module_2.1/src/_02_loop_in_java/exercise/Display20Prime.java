package _02_loop_in_java.exercise;

public class Display20Prime {
    public static void main(String[] args) {
        int dem = 0;
        int i = 1;
        while (dem <= 20){
            i += 1;
           if(i == 2){
               System.out.println(i);
               dem++;
           }else {
               boolean check = true;
               for (int j = 2;j < i;j++){
                   if(i % j == 0){
                       check = false;
                     break;
                   }else {
                      check = true;
                   }
               }
               if(check){
                   System.out.println(i);
                   dem++;
               }
           }
        }
    }
}
