package Day21_LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
list.addFirst(10);
list.addFirst(20);
list.addFirst(30);

list.display();
list.insertAtEnd(9);
list.insertAtEnd(0);
list.display();
list.deleteFirst();
list.display();

list.deleteLast();
list.display();
list.deleteByValue(10);
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

    //add new node(Starting)
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

// 🔹 Add at end 
    public void insertAtEnd(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    //delete first 
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty list");
        }
        head = head.next;
    }

    //delete last Node
public void deleteLast(){
    if(head == null ){
        System.out.println("Empty List");
    }
    if(head.next == null){
        head = null;
        return ; 
    }
    Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }
    temp.next=null;
}


public void deleteByValue(int value) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // If head needs to be deleted
    if (head.data == value) {
        head = head.next;
        return;
    }

   Node temp = head; 
   while (temp.next != null && temp.next.data !=value) {
    temp = temp.next;    
   }
   if(temp.next == null){
    System.out.println("Node Not Found");
   }
   else{
    temp.next = temp.next.next;
   }
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
