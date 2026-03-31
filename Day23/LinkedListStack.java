package Day23;
class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }     
    }

public class LinkedListStack {
   Node top ;
   void push(int data){
        Node newNode = new Node(data);
        newNode.next =top;
        top = newNode; 
   }
   int pop(){
    if(top==null){
        System.out.println("Underflow");
            return -1;
    }
     int val = top.data;
        top = top.next;
        return val;
    
   }
 // Display
    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();   // 30 -> 20 -> 10 -> NULL

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top: " + stack.peek());   // 20
    }
    int peek() {
        if (top == null) return -1;
        return top.data;
    }
}
