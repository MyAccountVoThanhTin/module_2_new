package _05_access_modifier_static_method_static_property.practice;

public class Demo {
     int count = 0;

    /*se lay bo nho chi mot lan và giu lai gia tri cua no */
    /*ket qua thuc hien in ra 3 dong cac gia tri : 1,2,3 */
    Demo() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Demo c1 = new Demo();
        Demo c2 = new Demo();
        Demo c3 = new Demo();
    }
}
