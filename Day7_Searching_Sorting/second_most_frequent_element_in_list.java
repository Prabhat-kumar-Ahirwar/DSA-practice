package Day7_Searching_Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class second_most_frequent_element_in_list {
     public static void main(String arg[] ){
     System.out.print("second Most Frequent Element "+ secondMostFrequent());
   }
  public static int secondMostFrequent() {
    int arr[] = {2,2,3,3,3};
  HashMap<Integer,Integer> map = new HashMap<>();
  for(int n: arr){
    map.put(n,map.getOrDefault(n,0)+1);
  }
  
  int firstMax = 0 ;
  int secondMax = 0 ;
  int secondElement=-1 ;
  int firstElement =-1;
  
  for(int key : map.keySet()){
    int freq = map.get(key);
    if(freq > firstMax){
      secondMax = firstMax;
      firstMax = freq;
      secondElement = firstElement;
      firstElement = key;
    }
    else if (freq > secondMax && freq < firstMax){
      secondMax= freq;
      secondElement = key;
      
    }
    
  }
  return secondElement;
  }
  
}
