import java.util.*;
public class InsertDuplicate {
    
    public static void Inserting(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k && i<arr.length-1){
                arr[i+1]=k;
                arr[i+1]=arr[i];
                i++;

            }
        }
    }
     public static void display(int arr[]){        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1, 0, 2, 3, 0, 4, 5, 0};
        
        display(arr);
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in); 
        int k = sc.nextInt();
        System.out.print("Input: ");
        Inserting(arr,k);
        System.out.print("Output: ");
        display(arr);
    }
}
