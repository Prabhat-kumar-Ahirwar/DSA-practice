//  Print duplicates from an array.
public class duplicate {
    public static void dupli(int arr[]) {
        boolean visited;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=-1){
             visited =true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    
                if(visited==true){
                    System.out.println(arr[i]);
                    visited = false;
                }
                }
                
            }
            
           }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={12,6,6,4,3,3,1};
        dupli(arr);
    }
}
