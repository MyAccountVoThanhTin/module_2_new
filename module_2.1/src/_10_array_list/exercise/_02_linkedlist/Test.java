package _10_array_list.exercise._02_linkedlist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addLast(3);
       // myLinkedList.addFirst(5);
        System.out.println(myLinkedList.remove(2));
      //  myLinkedList.printList()
        List list = new LinkedList();
    }
}
