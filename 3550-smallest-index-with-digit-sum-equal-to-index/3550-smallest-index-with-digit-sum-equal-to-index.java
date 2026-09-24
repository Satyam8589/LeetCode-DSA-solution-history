class Solution {

    private int findSum(int num) {

        int sum = 0;

        while (num > 0) {

            int n = num % 10;
            sum += n;
            num /= 10;
        }

        return sum;
    }

    public int smallestIndex(int[] nums) {

        int length = nums.length;

        int smallestInd = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {

            int finalNum = findSum(nums[i]);

            if (i == finalNum) {
                smallestInd = Math.min(smallestInd, i);
            }
        }

        if (smallestInd == Integer.MAX_VALUE) {
            return -1;
        }
        
        return smallestInd;
    }
}