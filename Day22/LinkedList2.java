package Day22;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.addFirst(70);
        list.addLast(10);
        list.display();
        list.ListLength();
    }
    public class Node {
    int data; 
    Node next;

    public Node(int data) { 
        this.data = data;
        this.next =null;
    }
    }
    Node head;
    //add Node at starting 
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //add node at end
    public void addLast(int data){
        Node last = new Node(data);
      
        if(head == null){
            head = last;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;
    }





    //display

    public void display(){
        Node temp = head;
        while (temp.next!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void ListLength(){
        int count = 0 ;
        Node temp = head;
        while (temp.next !=null) {
             count++;
            temp = temp.next;
           
        }
        System.out.println("Length : "+ count);
    }

}
