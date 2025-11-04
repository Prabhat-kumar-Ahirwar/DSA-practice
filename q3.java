/*There are n children who want to go to a Ferris wheel, and your task is to find a gondola for each child.
Each gondola may have one or two children in it, and in addition, the total weight in a gondola may not exceed x. You know the weight of every child.
What is the minimum number of gondolas needed for the children?
Input
The first input line contains two integers n and x: the number of children and the maximum allowed weight.
The next line contains n integers p_1,p_2,\ldots,p_n: the weight of each child.
Output
Print one integer: the minimum number of gondolas.
Constraints

1 \le n \le 2 \cdot 10^5
1 \le x \le 10^9
1 \le p_i \le x

 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class q3 {
    public static void main(String[] args){
	int n=4; // number of child
	int m=10; //max weight 
	int arr[]={9,6,9,5};
	int count=0;
    Arrays.sort(arr);
	int low=0;
	int high= arr.length-1;
	while (low<=high) {
        if((arr[low]+arr[high]) >=10){
			high--;
			
		}
		else {
			low++;
			high--;
			
		} count++;
    }
	System.out.print("total gondal = " + count);
	}
}
