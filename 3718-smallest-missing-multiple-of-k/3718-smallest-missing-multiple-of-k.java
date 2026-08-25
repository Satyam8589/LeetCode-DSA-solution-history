class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int j = 2;
        int number = k;

        while (set.contains(number)) {
            number = k * j;
            j++;
        }

        return number;
    }
}