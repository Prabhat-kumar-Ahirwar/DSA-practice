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
    //delete first node 
     public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        head = head.next;
     }

     //delete Last Node
     public void deleteLast(){
        if(head == null){
            System.out.println("empty list");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head ; 
        while (temp.next.next!= null) {{
            temp = temp.next;
        }
        temp.next = null;
            
        }
     }

     //delete any node
     public void deleteNode(int value){
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
