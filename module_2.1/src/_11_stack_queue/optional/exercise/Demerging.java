package _11_stack_queue.optional.exercise;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Demerging {
    static class Person {
        private String name;
        private boolean gender = true;
        private String birthday;

        public Person() {
        }

        public Person(String name, boolean gender, String birthday) {
            this.name = name;
            this.gender = gender;
            this.birthday = birthday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

//        public int compare(String birthday){
//
//        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", birthday='" + birthday + '\'' +
                    '}';
        }
    }

    public static void printObject(Queue<Person> queue) {
//        while (!queue.isEmpty()){
//            System.out.print(queue.poll());
//            System.out.println();
//        }
        for (Person person : queue){
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        Person person = new Person("tin",true,"18/01/1997");
        Person person1 = new Person("a",false,"12/12/2000");
        Person person2 = new Person("b",true,"11/11/1997");
        Person person3 = new Person("c",false,"05/06/2018");
        Queue<Person> nu = new LinkedList();
        Queue<Person> nam = new LinkedList();
        Stack stack = new Stack();
        stack.push(person);
        stack.push(person1);
        stack.push(person2);
        stack.push(person3);
        while (!stack.isEmpty()){
            Person temp = (Person) stack.pop();
            if(temp.gender){
                nam.add(temp);
            }else {
                nu.add(temp);
            }
        }
        System.out.println("Before :");
        System.out.println("List nu : ");
        printObject(nu);
        System.out.println();
        System.out.println("list nam : ");
        printObject(nam);

        System.out.println("After  : ");

    }
}
