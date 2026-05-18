import java.util.*;
public class search {
    public static void Find(int arr[],int target){
        
        for(int i=0;i<arr.length;i++)
        if(target==arr[i]){
            System.out.print("Target is found index : "+ i);
        }
      
    }
    public static void main(String[] args) {
        int arr[]={12,45,7,5,8};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Target : ");
        int tofind= sc.nextInt();
        sc.close();
        Find(arr,tofind);
    }
}
