package Day23;

import java.util.Stack;

public class FirstStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        
        System.out.println("pop Element " + stack.pop());
        System.out.println("Peek Element " +stack.peek());
        
    }
}
