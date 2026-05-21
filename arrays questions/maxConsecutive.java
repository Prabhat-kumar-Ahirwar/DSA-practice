public class maxConsecutive {
     public static void display(int arr[]){        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void consecutive(int arr[]){
        int max=0;
        int data=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                data=arr[i+1];
            }
            else {
                if (max < count) {
                    max = count;
                    max = data;
                    count = 0;
                }
            }
        }
        
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,1,5,5,5,6,6,6,6,7,8,9};
        display(arr);
        consecutive(arr);
        
    }
}
