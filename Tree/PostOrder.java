package Tree;

import java.io.*;
import java.util.*;

public class PostOrder {
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
                root.left=insert(root.left , data);
            }
            else{
                root.right = insert(root.right , data);
            }
            return root;
        }
    }
    
    public static void postorder(Node root){
        if(root == null){
            return ;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        Node root = null; 
        
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        postorder(root);
    }
}

