package _11_stack_queue.practice._02_queue;

import java.util.List;
import java.util.Queue;

public class MyLinkedListQueue {
    private class Node{
        private int key;
        private Node next;
        public  Node(int key){
           this.key = key;
           this.next = null;
        }
    }
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
