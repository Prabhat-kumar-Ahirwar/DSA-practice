package Day27;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class QueueLL {
    Node front, rear;

    public void enqueue(int x) {
        Node temp = new Node(x);

        if (rear == null) {
            front = rear = temp;
            return;
        }

        rear.next = temp;
        rear = temp;
    }

    public int dequeue() {
        if (front == null) return -1;

        int val = front.data;
        front = front.next;

        if (front == null) rear = null;

        return val;
    }
}