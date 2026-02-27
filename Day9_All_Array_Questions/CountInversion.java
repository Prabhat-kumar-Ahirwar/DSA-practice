package Day9_All_Array_Questions;

import javax.print.DocFlavor.READER;

public class CountInversion {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(" the number of inversions in the array : "+ mergeSort(arr,0,arr.length-1));
    }
    public static int mergeSort(int arr[], int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
           count += mergeSort(arr, left, mid);
           count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }
    public static int merge(int arr[] , int left , int mid , int right){
        int n1 = mid-left+1 ; 
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=left;
        int InversionCount=0;
        while (i<n1 && j<n2) {
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]= R[j];
                j++;
                InversionCount += (n1 - i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return InversionCount;
    }

    
    














    /*
    Brute Force Method 
    public static void Inversion(int arr[]){
        int count = 0;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            for(int j=i ; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
    System.out.println("COUNT : "+ count);
    }
    */
}
