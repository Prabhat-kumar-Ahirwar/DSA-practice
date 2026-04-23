package Tree;
import java.io.*;
import java.util.*;

public class PreorderDemo {
    static class Node{
        int data; 
        Node left;
        Node right;
        
        Node(int d){
            data = d; 
            left =null;
            right = null;
        }
    }
    public static Node insert(Node root , int data){
        if(root == null){
            return new Node(data);
        }
        else{
            if(data <= root.data){
                root.left = insert(root.left,data);
            }
            else{
                root.right = insert(root.right , data);
            }
            return root;
        }
        
    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    Node root = null;
    while(t-- > 0){
        int data = sc.nextInt();
        root = insert(root , data);
    }
    preorder(root);
    }
}
