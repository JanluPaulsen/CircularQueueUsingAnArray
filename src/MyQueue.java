public class MyQueue {
    private int[] data;
    private int front;
    private int rear;
    private int count;

    private int n;

    public MyQueue(int size) {
        n = size;
        data = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void enqueue(int value) {
        data[rear] = value;
        rear = (rear + 1) % n;
        count++;
    }

    public int dequeue() {
        int returnValue = data[front];
        front = (front + 1) % n;
        count--;
        return returnValue;
    }

    public boolean isEmpty() {
        return (count == 0 && front == rear);
    }

    public boolean isFull() {
        return (count == n && front == rear);
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = front; i < front + count; i++) {
                System.out.print(data[i % n] + " ");
            }
            System.out.println("");
        }
    }
}