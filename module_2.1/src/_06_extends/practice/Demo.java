package _06_extends.practice;

public class Demo {
    static class B {
        public void p(double number) {
            System.out.println(number * 2);
        }
    }


    static class A extends B{
        @Override
        public void p(double number) {
            System.out.println(number);
        }
        public void p(int a,String b ){
            System.out.println("so a "+ a+" string"+ b);
        }

    }

    public static void main(String[] args) {
        A a = new A();
       a.p(5);
       a.p(7,"tin");
       B b = new B();
       b.p(5);
    }
}




