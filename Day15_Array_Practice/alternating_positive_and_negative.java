package Day15_Array_Practice;

import java.util.ArrayList;
import java.util.List;

public class alternating_positive_and_negative {

    public static void main(String[] args) {
    int arr[] ={2,-3,-4,2,1,6,-4,-2};
    Rearrange(arr);    
    }

    private static void Rearrange(int[] arr) {
    List<Integer> pos  = new ArrayList<>();
    List<Integer> neg  = new ArrayList<>();

    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            pos.add(arr[i]);
        }
        else{neg.add(arr[i]);}
        
    }
    System.out.println(pos);
    System.out.println(neg);
int i = 0, p = 0, n = 0;
    // merge 
   while (p<pos.size() && n < neg.size()) {
     arr[i] = pos.get(p);
    i++;
    p++;
    arr[i] = neg.get(n);
    i++;
    n++;
   
   }
   // Append remaining positives
        while(p < pos.size()) arr[i++] = pos.get(p++);
        while(n < neg.size()) arr[i++] = neg.get(n++);

        for (int k=0;k<arr.length ;k++) {
            System.out.print(arr[k]+" ");
        }
    }
    
    
}
