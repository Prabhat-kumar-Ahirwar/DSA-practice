package Day18_LinkedList;
class Node {
    int data;      
    Node next;     
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public Node head;
    LinkedList(){
        head=null;
    }
    public void addInFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
      public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
}
