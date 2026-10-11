class Solution {
    public int sumOfSquares(int[] nums) {

        int result = 0;
        int n = nums.length;

        //Base Case
        if (n == 0) {
            return 0;
        }

        //Find sum of square of special number
        for (int i = 0; i < n; i++) {

            if (n % (i + 1) == 0) {

                int sqr = nums[i] * nums[i];
                result += sqr;
            }
        }
        return result;
    }
}