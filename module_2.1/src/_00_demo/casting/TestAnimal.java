package _00_demo.casting;

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("----Normal:");
        // property of Animal
        casting.Animal animal0 = new casting.Animal();
        System.out.println(animal0.eyes);
        animal0.move();
        animal0.growl();

        System.out.println("----Implicit casting:");
        // Cha cha = new Con();
        casting.Animal animal = new casting.Person();
        System.out.println(animal.eyes);
        animal.move();
        animal.growl();

        System.out.println("----Explicit casting:");
        casting.Person person = (casting.Person) animal;
        System.out.println(person.hands);
        System.out.println(person.legs);
        person.move();
        person.growl();
        person.read();
//        float a = 3.3f;
//        int b = (int) a;
    }
}
