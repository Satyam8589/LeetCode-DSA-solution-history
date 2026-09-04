class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            int a = 0;
            int b = i;

            while (a <= i) {
                max = Math.max(max, nums[a]);
                a++;
            }

            while (b <= n - 1) {
                min = Math.min(min, nums[b]);
                b++;
            }

            if (max - min <= k) {
                return i;
            }
        }
        return -1;
    }
}