package Tree;
public class Knapsack {

    public static int knapsack(int[] weights, int[] values, int W) {

        int n = weights.length;

        // DP table
        int[][] dp = new int[n + 1][W + 1];

        // Build table
        for (int i = 1; i <= n; i++) {

            for (int w = 1; w <= W; w++) {

                // If current item can fit
                if (weights[i - 1] <= w) {

                    dp[i][w] = Math.max(
                            values[i - 1] + dp[i - 1][w - weights[i - 1]],
                            dp[i - 1][w]
                    );

                } else {

                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};

        int W = 7;

        int result = knapsack(weights, values, W);

        System.out.println("Maximum Value = " + result);
    }
}