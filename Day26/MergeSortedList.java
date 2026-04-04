package Day26;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedList {

    public Node merge(Node list1, Node list2) {

        Node dummy = new Node(0);  // temporary start
        Node temp = dummy;         // pointer to build result

        while(list1 != null && list2 != null) {
            if(list1.data < list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // attach remaining nodes
        if(list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next; // actual head
    }
     // 🔹 helper method to print list
    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         MergeSortedList obj = new MergeSortedList();

        // 🔹 Create first list: 1 → 3 → 5
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        // 🔹 Create second list: 2 → 4 → 6
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        // 🔹 Merge lists
        Node result = obj.merge(list1, list2);

        System.out.print("Merged List: ");
        printList(result);
    }
}