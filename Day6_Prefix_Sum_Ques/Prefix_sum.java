package Day6_Prefix_Sum_Ques;

public class Prefix_sum {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        Summ(arr);
    }
    public static void Summ(int arr[]){
        int n =arr.length ;
        int res[] = new int[n];
        res[0] = arr[0];
        for(int i=1;i<n;i++){
            res[i] = res[i-1]  + arr[i];
        }    
        for(int j=0;j<n;j++){
            System.out.print(res[j]+ " ");
        }
    }
}
