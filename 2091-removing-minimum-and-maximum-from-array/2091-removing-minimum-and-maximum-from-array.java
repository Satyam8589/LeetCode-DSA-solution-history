class Solution {
    public int minimumDeletions(int[] nums) {

        int maxPlace = 0;
        int minPlace = 0;

        int ans = 0;

        int mid = (nums.length - 1) / 2;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[maxPlace]) {
                maxPlace = i;
            }

            if (nums[i] < nums[minPlace]) {
                minPlace = i;
            }
        }

        if (maxPlace <= mid && minPlace <= mid) {

            ans = Math.max(maxPlace + 1, minPlace + 1);

        } else if (maxPlace > mid && minPlace > mid) {

            ans = Math.max(nums.length - maxPlace, nums.length - minPlace);

        } else {

            int max = Math.max(maxPlace, minPlace);
            int min = Math.min(maxPlace, minPlace);

            int front = max + 1;
            int back = nums.length - min;
            int both = (min + 1) + (nums.length - max);

            ans = Math.min(front, Math.min(back, both));

        }
        return ans;
    }
}