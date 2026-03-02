package Day11_String;

public class LowerToUpper {

    public static void main(String[] args) {
        convert("HeLlOw");
    }

    public static void convert(String str) {

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - 32);
            }
        }

        System.out.println(new String(arr));
    }
}