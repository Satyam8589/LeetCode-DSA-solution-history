class Solution {
    public int singleNonDuplicate(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length <= 0) {
            return 0;
        }
        
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}