package Day11_Srting;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean ans = IsPallindrome(str);
        if (ans) {
            System.out.println("Pallinadrome");
        }
        else{
            System.out.println("not pallindrome");
        }

    }
    
    public static boolean IsPallindrome(String str){
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int i=0;
        int j =arr.length-1;
        boolean flag = true;
        while (i<j) {
            if(arr[i]!= arr[j]){
                flag = false;
                break;
            }
            else{
                flag = true;
            }
            i++;
            j--;
        }
        return flag;
    }
}
