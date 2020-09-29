package casting;

public class Person extends casting.Animal {
    //thuoc tinh va phuong thuc Cha
    public String hands;
    public String legs;

    @Override
    public void move() {
        System.out.println("Move by legs");
    }

    public void read() {
        System.out.println("tin !");
    }
}
