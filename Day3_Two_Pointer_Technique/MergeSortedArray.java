package Day3_Two_Pointer_Technique;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[]={2,5,6};
        int m= 3;// length of arr1
        int n= 3;// length of arr2
        int result[] = new int[m+n];
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i >= 0 && j >= 0){
            if(arr1[i]<arr2[j]){
                result[k]=arr2[j];
                k--;
                j--;
            }
            else{
                result[k]=arr1[i];
                k--;
                i--;
            }
        }
        for(int a=0;a<k;a++){
            System.out.print(result[a]+" ");
        }
    }
}
