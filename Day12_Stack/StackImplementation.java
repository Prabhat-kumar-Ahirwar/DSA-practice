package Day12_Stack;

public class StackImplementation {

    static int top = -1;     // tracks top index
    static int size = 5;     // stack size
    static int[] arr = new int[size];  // stack array

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        peek();

        pop();
        peek();
    }

    // PUSH
    public static void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // POP
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }

    // PEEK
    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }
}