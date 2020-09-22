package _11_stack_queue.optional.practice;

public class QueueInArray {
    private int capacity, head = 0, tail = -1, currentSize = 0;
    private int[] queueArr;

    public QueueInArray(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public QueueInArray(int capacity, int head, int tail, int currentSize, int[] queueArr) {
        this.capacity = capacity;
        this.head = head;
        this.tail = tail;
        this.currentSize = currentSize;
        this.queueArr = queueArr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int[] getQueueArr() {
        return queueArr;
    }

    public void setQueueArr(int[] queueArr) {
        this.queueArr = queueArr;
    }

    public boolean isQueueFull() {
        return (this.currentSize == this.capacity) ? true : false;
    }

    public boolean isQueueEmpty() {
        return (this.currentSize == 0) ? true : false;
    }

    public void enQueue(int item) {
        if (isQueueFull()) {
            System.out.println("NOT add item because arr is full !");
        } else {
            this.tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;  
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println(queueArr + " is empty NOT delete !");
        } else {
            this.head++;
            if (this.head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}

