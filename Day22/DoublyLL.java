package Day22;

public class DoublyLL {
public static void main(String[] args) {
    DoublyLL list = new DoublyLL();
    list.addFirst(50);
    list.addFirst(40);
    list.addFirst(30);
    list.addFirst(20);
    list.addFirst(10);
    list.display();
    list.addEnd(60);
    list.display();
    list.deleteAtBeginning();
    list.display();
    list.deleteAtEnd();
    list.display();
    
}


    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    //Method to add a node at the front of the list

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    //Method to add a node at the end of the list
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head; 
            while (temp.next !=null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

//delete node from starting
    public void deleteAtBeginning() {
    if (head == null) {System.out.println("null");};

    head = head.next;
    if (head != null) {
        head.prev = null;
    }
    }   

        //delete node from end
        public void deleteAtEnd(){
            if(head == null){
                System.out.println("Null");
            }
            if(head.next == null){
                head = null;
            }
            Node temp = head;
            while (temp.next !=null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }

    public void displayBackward() {
        if (head == null) return;        

        Node temp = head;                
        while (temp.next != null) {      
            temp = temp.next;
        }
        // Now temp is the last node
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;           
        }
        System.out.println();
    }

    // display 
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;           
        }
        System.out.println("null");
    }
}
