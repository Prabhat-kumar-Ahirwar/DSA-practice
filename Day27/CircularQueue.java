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

    // Enqueue
    public void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    // Dequeue
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
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

    // Peek
    public int peek() {
        if (front == -1) return -1;
        return arr[front];
    }

    // Display
    public void display() {
        if (front == -1) {
            System.out.println("Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        // Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.print("Queue: ");
        q.display();

        // Dequeue
        System.out.println("Dequeued: " + q.dequeue());

        System.out.print("Queue after dequeue: ");
        q.display();

        // Add more elements (circular behavior)
        q.enqueue(50);
        q.enqueue(60);

        System.out.print("Queue after circular enqueue: ");
        q.display();

        // Peek
        System.out.println("Front element: " + q.peek());
    }
}