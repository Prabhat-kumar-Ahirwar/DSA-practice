
public class MergingArray {
    public static void display(int arr[]){        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Merge(int arr1[],int arr2[],int s1,int s2) {
    int size=s1+s2;
    int[] resultant = new int[size];
    int i, j, k;
    i = j = k = 0;
    /*
        arr1: {1, 2, 13, 15, 62}
        arr2: {2, 3, 4, 5, 6}
        i = 2
        j = 2
        k = 1
        resultant: [1, 2, 2, 3, 4, 5, 6, 13, 15, 62]
    */
    while(i < s1 && j < s2){
        if(arr1[i] < arr2[j]){
            resultant[k] = arr1[i];
            i++;
            k++;
        }
        else if(arr2[j] < arr1[i]){
            resultant[k] = arr2[j];
            j++;
            k++;
        }
        else{
            resultant[k] = arr2[j];
            k++;
            resultant[k] = arr1[i];
            i++;
            j++;
            k++; 
        }
    }

    while(i < s1){
        resultant[k] = arr1[i];
        k++;
        i++;
    }
    
    while(j < s2){
        resultant[k] = arr2[j];
        k++;
        j++;
    }
    System.out.println("Merged array is: " ); 
    display(resultant);
}


    public static void main(String[] args) {
        int arr1[]={1, 2, 13, 15, 62};
        int arr2[]={2, 3, 4, 5, 6};
        int s1=arr1.length;
        int s2=arr2.length;
        Merge(arr1, arr2, s1, s2);

    }
}
