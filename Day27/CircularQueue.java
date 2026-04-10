package Day27;
public class CircularQueue {
    int[] arr;
    int front, rear, size;

    CircularQueue(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    public void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Full");
            return;
        }

        if (front == -1) front = 0;

        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Empty");
            return -1;
        }

        int val = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return val;
    }
}