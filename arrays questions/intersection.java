public class intersection {
    public static void interSect(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
             if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
             }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,6,7,8};
        int arr2[]={12,3,4,5,7,9};
        interSect(arr1,arr2);
    }
}
