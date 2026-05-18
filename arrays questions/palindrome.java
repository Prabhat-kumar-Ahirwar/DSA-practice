public class palindrome {
    
    public static void isPalindrome(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("Array is not Palindrome ");
                return;
            }
            start++;
            end--;
        
        }
        System.out.println("Array is palindrome");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        isPalindrome(arr);
    }
}
