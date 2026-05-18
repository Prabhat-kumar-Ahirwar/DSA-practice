public class minmax {
    
    public static void min(int arr[]){
       int min=arr[0]; 
       int max=arr[0];
        for(int i=0;i<arr.length;i++){
        
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
        }
        System.out.println("max value: "+ max);
        
        System.out.println("min value: "+ min);

    }
    public static void main(String[] args) {
        int arr[]={2,5,123,57,7,0,4,6};
        min(arr);
    }
}
