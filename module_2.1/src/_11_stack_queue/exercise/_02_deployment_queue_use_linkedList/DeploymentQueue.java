package _11_stack_queue.exercise._02_deployment_queue_use_linkedList;

public class DeploymentQueue<E> {
    public class Node {
        private E data;
        private Node link;

        public Node(E data) {
            this.data = data;
            this.link = null;
        }
    }

    private Node front;
    private Node rear;

    public DeploymentQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(E element) {
        Node newNode = new Node(element);
        if(this.rear == null){
            this.front = this.rear = newNode;
        }
        this.rear.link = newNode;
        this.rear = newNode;
    }
    public Node deQueue(){
        Node temp = this.front;
        if(this.front == null){
          return null;
        }else if(this.rear == this.front){
            this.rear = this.front = null;
        }else
            this.front = this.front.link;
        return temp;
    }
    public void displayQueue(){
        Node temp = this.front;

        while (temp != this.rear){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println(this.rear.data);
    }
    public static void main(String[] args) {
        DeploymentQueue deploymentQueue = new DeploymentQueue();
        deploymentQueue.enQueue(5);
        deploymentQueue.enQueue(6);
        deploymentQueue.enQueue(7);
        deploymentQueue.enQueue(8);
        deploymentQueue.deQueue();
        deploymentQueue.displayQueue();
//        deploymentQueue.deQueue();
//        System.out.println(deploymentQueue);
    }
}
