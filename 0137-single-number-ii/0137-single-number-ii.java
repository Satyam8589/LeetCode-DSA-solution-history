class Solution {
    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length <= 0) {
            return 0;
        }

        int count = 0;
        int element = 0;

        Arrays.sort(nums);

        for (int num : nums) {

            if (count % 3 == 0) {
                element = num;
                count = 0;
            }

            if (element == num) {
                count++;
            }
        }
        return element;
        
    }
}