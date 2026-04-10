package Day27;

public class Queue {
    int[] arr ; 
    int rear , front ,size;

    Queue(int n){
        arr = new int[n];
        size = n;
        rear =0;
        front = 0;
}

    //enqueue
    public void enqueue(int x){
        if (rear == size) {
            System.out.println("Queue is full");
            return ;
        }
        arr[rear] = x ;
        rear++;
    }

    //dequeue
    public int dequeue(){
        if (rear == front) {
            System.out.println("Empty");
            return -1;
        }
        int val = arr[front];
        front++;
        return val;
    }

    //peek
    public int peek(){
        if (rear == front) {
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }

    //isEmpty
    public boolean isEmpty(){
        return rear == front;
    }
}