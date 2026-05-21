public class Occurancce {
    
    public static void occur(int arr[]){
        boolean ar1[]= new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(ar1[i])
                continue;
            
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ar1[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" : "+count);
           
        }
        
    }

    public static void main(String[] args) {
     int arr[]={1,2,2,3,4} ;
     occur(arr);  
    }
}
