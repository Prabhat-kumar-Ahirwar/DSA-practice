package Day21_LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
list.addFirst(10);
list.addFirst(20);
list.addFirst(30);

list.display();
    }
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    Node head;

    //add new node
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //display

    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "-->");
            temp= temp.next;
        }
        System.out.println("null");
    }
}
