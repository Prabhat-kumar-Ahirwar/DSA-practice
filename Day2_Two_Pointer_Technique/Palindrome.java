package Day2_Two_Pointer_Technique;

public class Palindrome {

    public static void main(String[] args) {
        boolean IsPalindrome= IsPalindrome("carc");
        if(IsPalindrome){
            System.out.println("this is valid palindrome");
        }
        else{
            System.out.println("not valid palindrome");
        }
    }
    public static boolean IsPalindrome(String s){
        int i = 0 ;
        int j=s.length()-1;
        while (i<j) {
           while (i<j && !Character.isLetterOrDigit(s.charAt(i))) {
            i++;
           }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))) {
            j--;
           }  
            if (Character.toLowerCase(s.charAt(i)) !=Character.toLowerCase(s.charAt(j))) {
            return false;
             }
             i++;
             j--;
        }
        
        return true;
    }
    
}
