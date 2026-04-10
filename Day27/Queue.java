package Day27;

public class Queue {
    int[] arr;
    int front, rear, size;

    Queue(int n) {
        arr = new int[n];
        size = n;
        front = 0;
        rear = 0;
    }

    // Enqueue
    public void enqueue(int x) {
        if (rear == size) {
            System.out.println("Queue is Full");
            return;
        }
        arr[rear] = x;
        rear++;
    }

    // Dequeue
    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        front++;
        return val;
    }

    // Peek
    public int peek() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // isEmpty
    public boolean isEmpty() {
        return front == rear;
    }

    
}