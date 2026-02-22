package Day4_Two_Pointer_Technique;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(IsSubsequence(s, t));

    }
    public static boolean IsSubsequence(String s, String t){
        int i=0;
        int j =0;
        while (i<s.length() && j<t.length()) {
            if(s.charAt(j)==s.charAt(i)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
