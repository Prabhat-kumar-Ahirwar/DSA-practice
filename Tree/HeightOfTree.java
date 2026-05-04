package Tree;


import java.io.*;
import java.util.*;

public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right ;
        
        Node(int d){
            //
            data = d; 
            left= null;
            right = null;
        }
    }
    
    public static Node insert(Node root , int data){
        if(root == null){
            return new Node(data);
        }
        else{
            if(data <= root.data ){
                root.left = insert(root.left , data);
            }
            else{
                root.right = insert(root.right ,data);
            }
            return root;
        }
    }
public static int height(Node root) {
        if (root == null) {
            return -1;   
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        Node root = null;

        while (t-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }

        System.out.println(height(root));
        
    }
}
