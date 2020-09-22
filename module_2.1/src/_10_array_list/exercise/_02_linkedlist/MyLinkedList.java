package _10_array_list.exercise._02_linkedlist;

import org.omg.CORBA.NO_IMPLEMENT;

public class MyLinkedList<E> {
    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object get(){
            return this.data;
        }
    }
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }
    public void addFirst(E e) {
        Node newNode = new Node(e);
        Node temp = head;
        head = newNode;
        newNode.next = temp;
        this.numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        this.numNodes++;
    }
    public void add(int index, E e){
        Node temp = head;
        Node holder;
        for (int i = 0;i <index -1 && temp.next != null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
       this.numNodes++;
    }
    public E remove(int index){
        Node temp  = head;
        Node holder;
        for (int i=0; i < index-1 && temp.next!=null ;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder;
    }
    public boolean remove(Object e){
        Node temp = head;
        while (temp.next != null){
            if (temp.data == e){
                temp.next = temp.next.next;
                return true;
            } else temp = temp.next;
        }
        return false;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
