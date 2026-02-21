package Day3_Two_Pointer_Technique;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1="car";
        String str2="rca";

    boolean result = IsAnagram(str1, str2);

    if(result){
        System.out.println("Anagram");
    } else {
        System.out.println("Not Anagram");
    }

    }
    public static boolean IsAnagram(String str1,String str2 ){
        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c,map.get(c));
              }

        return true;

    }
}
