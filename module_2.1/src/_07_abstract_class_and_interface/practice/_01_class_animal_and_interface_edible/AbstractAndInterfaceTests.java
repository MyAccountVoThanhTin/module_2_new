package _07_abstract_class_and_interface.practice._01_class_animal_and_interface_edible;

import _07_abstract_class_and_interface.practice._01_class_animal_and_interface_edible.fruit.Apple;
import _07_abstract_class_and_interface.practice._01_class_animal_and_interface_edible.fruit.Fruit;
import _07_abstract_class_and_interface.practice._01_class_animal_and_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
