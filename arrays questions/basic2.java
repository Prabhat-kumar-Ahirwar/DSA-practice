public class basic2{
    
    public static void display(int arr[]){        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void read(int arr[]){
        // Insert
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        } 
    }

    public static void main(String args[]){

        int arr[] = new int[10];    // Create

        read(arr);
        
        display(arr);

        arr[0] = 100;

        display(arr);

        
    }
}