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
    //
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
    //

    // display 
    public void display(){
        Node temp = head;
        while (temp.next!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;           
        }
        System.out.println("null");
    }
}
