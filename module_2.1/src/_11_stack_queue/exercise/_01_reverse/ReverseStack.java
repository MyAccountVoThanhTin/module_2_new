package _11_stack_queue.exercise._01_reverse;

import java.util.*;

public class ReverseStack<i> {
    public static int random() {
        int holder = (int) ((Math.random() * 1000) + 1);
        return holder;
    }
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        Stack<Integer> list1 = new Stack<>();
        for (int i = 0; i <= 5; i++) {
            list.add(ReverseStack.random());
        }
        System.out.println();
        System.out.println("list before reverse : ");
        while (!list.isEmpty()) {
            int temp = list.pop();
            list1.push(temp);
            System.out.print(temp +" ");
        }
        System.out.println("list after reverse : ");
       // Collections.reverse(list1);
        while (!list1.isEmpty()) {
            System.out.print(list1.pop() +" ");
        }
    }
}
