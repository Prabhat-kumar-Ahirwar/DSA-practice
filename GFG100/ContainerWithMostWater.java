package GFG100;

public class ContainerWithMostWater {

    public static int maxWater(int[] arr) {

        int max = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int width = right - left;

            int height = Math.min(arr[left], arr[right]);

            int currentWater = width * height;

            max = Math.max(max, currentWater);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Maximum Water: " + maxWater(arr));
    }
}