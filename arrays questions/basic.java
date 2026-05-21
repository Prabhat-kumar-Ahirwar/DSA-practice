import java.util.Arrays;

public class basic{
    
    public static void main(String args[]){

        int arr[] = new int[10];    // Create

        // Insert
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        
        // First way: using normal for loop to Read/Traverse data
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Second way: using Arrays class method 
        System.out.println(Arrays.toString(arr));

        // Third way: using for-each or enhanced for loop
        for(int data:arr){
            System.out.print(data + " ");
        }
    }
}