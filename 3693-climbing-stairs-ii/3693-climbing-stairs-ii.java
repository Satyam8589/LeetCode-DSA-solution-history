class Solution {

    public int minCostStair(int n, int[] costs, int[] dp) {

        if (n == 0) {
            return 0;
        }


        if (dp[n] != -1) {
            return dp[n];
        }

        int minCost = Integer.MAX_VALUE;

        for (int jump = 1; jump <= 3; jump++) {

            if (n - jump >= 0) {

                int currentCost = minCostStair(n - jump, costs, dp)
                                + costs[n - 1]
                                + jump * jump;

                minCost = Math.min(minCost, currentCost);
            }

        }
        return dp[n] = minCost;
    }

    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return minCostStair(n, costs, dp);
        
    }
}