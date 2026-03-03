package Day12_Stack;

import java.util.Stack;

public class ReverseString {
    
    public static void main(String[] args) {
        String str ="HELLO";
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i <str.length() ;i++){
            stack.push(str.charAt(i));
        }

        String Reverse = "";
        while (!stack.isEmpty()) {
            Reverse+= stack.pop();
        }
         System.out.println("Original: " + str);
        System.out.println("Reversed: " + Reverse);
    }

}
