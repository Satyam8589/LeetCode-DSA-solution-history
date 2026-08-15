// class Solution {

//     static void subsetFind(
//         int[] nums,
//         int index,
//         ArrayList<Integer> li,
//         Stack<List<Integer>> st) {

//         if (index == nums.length) {
//             st.push(new ArrayList<>(li));
//             return;
//         }

//         subsetFind(nums, index + 1, li, st);
//         li.add(nums[index]);
//         subsetFind(nums, index + 1, li, st);

//         li.remove(li.size() - 1);
//     }

//     public int longestSubsequence(int[] nums) {

//         Stack<List<Integer>> st = new Stack<>();

//         int longest = Integer.MIN_VALUE;
//         int current = 0;

//         subsetFind(nums, 0, new ArrayList<>(), st);

//         while (!st.isEmpty()) {

//             List<Integer> num = st.pop();

//             int xor = 0;

//             for (int i = 0; i < num.size(); i++) {
//                 xor = xor ^ num.get(i);
//             }

//             if (xor != 0) {
//                 current = num.size();
//             }

//             longest = Math.max(longest, current);
//         }
//         return longest;
//     }
// }



class Solution {

    public int longestSubsequence(int[] nums) {

        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                hasNonZero = true;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        if (hasNonZero) {
            return nums.length - 1;
        }

        return 0;
    }
}