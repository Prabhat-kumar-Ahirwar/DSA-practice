public class bubblesort{
    
    public static void display(int arr[]){        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void BubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i = 0; i < n; i++){
            swapped = false;
            for(int j = 0; j < n-1-i; j++){                
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

    public static void main(String args[]){

        int arr[] = {7, 5, 3, 1, 0, 8, 11, 19};        
        display(arr);
        BubbleSort(arr);
        display(arr);
        
    }
}