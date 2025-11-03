/* You are given a list of n integers, and your task is to calculate the number of distinct values in the list.
Input
The first input line has an integer n: the number of values.
The second line has n integers x_1,x_2,\dots,x_n.
Output
Print one integers: the number of distinct values.
Constraints

1 < n < 2.10^5
1 < x_i < 10^9 */


public class q1 {
	public static void main(String[] args){
        int count=0;	
		int arr[]={2,3,2,2,3};
        int n = arr.length;
		for(int i=0;i<n;i++){
            boolean isDuplicate = false;
	    	for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
			}
            if(! isDuplicate){
                count++;
            }
		}
        System.out.println("answer: "+ count);
	}
}


