package Day4_Two_Pointer_Technique;

public class Append_Characters_To_String_To_Make_Subsequence {
     public static int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(i< s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return t.length()-j;
    
    }
    public static void main(String[] args) {
        String s = "coaching";
        String t="coding";
        System.out.print(appendCharacters(s,t));
    }
}
