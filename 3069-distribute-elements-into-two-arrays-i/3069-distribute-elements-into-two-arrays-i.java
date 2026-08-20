class Solution {

    public int[] resultArray(int[] nums) {
        
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int[] res = new int[n];

        int a1 = 1;
        int b1 = 1;

        for (int i = 2; i < nums.length; i++) {

            if (arr1[a1 - 1] > arr2[b1 - 1]) {
                arr1[a1] = nums[i];
                a1++;
            } else {
                arr2[b1] = nums[i];
                b1++;
            }
        }

        for (int i = 0; i < a1; i++) {
            res[i] = arr1[i];
        }

        for (int j = 0; j < b1; j++) {
            res[a1 + j] = arr2[j];
        }

        return res;
    }
}