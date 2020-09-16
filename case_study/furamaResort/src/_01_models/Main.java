package _01_models;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        System.out.println(house.showInfor());
        Room room = new Room();
        System.out.println(room.showInfor());
        Villa villa =  new Villa();
        System.out.println(villa.showInfor());
    }
}
