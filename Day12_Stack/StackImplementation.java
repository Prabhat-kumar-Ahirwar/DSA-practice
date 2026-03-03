package Day12_Stack;

public class StackImplementation {
        static int top=-1;
        static int size = 5;
        static int[] arr = new int[size];
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        // push(40);
        // push(50);
        isFull();
        // for(int i=0 ;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
    }
    public static void push(int value){
        if(top == size-1){
            System.out.println("Stack overflow.");
        }
        else{
            top++;
            arr[top] = value;
            System.out.println(value+" pushed into the stack");
        }
    }
    public static void pop(){
        if(top== -1){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println("element poped");
            top--;
        }
    }
    public static void peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(arr[top]+" this is peek element");
        }
    }
    public static boolean isFull() {
    return top == size - 1;
}
   
}
