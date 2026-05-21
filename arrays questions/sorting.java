public class sorting {
    
    public static void sort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j=i ;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
                    System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={ 1,6,3,8,4};
        sort(arr);
    }
}
