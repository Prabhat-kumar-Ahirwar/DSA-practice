package Day23;

public class ArrayStack {

    int top = -1;
    int arr[] = new int[5];

    // Push method
    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop method
    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Main method
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20
        System.out.println(stack);
    }
}