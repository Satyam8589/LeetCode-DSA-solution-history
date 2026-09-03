class Solution {
    public boolean uniformArray(int[] nums1) {

        int findMinOdd = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] < findMinOdd && nums1[i] % 2 != 0) {
                findMinOdd = nums1[i];
            }
        }

        if (findMinOdd == Integer.MAX_VALUE) {
            return true;
        } else {

            for (int i = 0; i < nums1.length; i++) {

                if (nums1[i] % 2 == 0) {

                    int find = nums1[i] - findMinOdd;

                    if (find < 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}