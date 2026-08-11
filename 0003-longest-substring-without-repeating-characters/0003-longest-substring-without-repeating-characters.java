class Solution {
    public int lengthOfLongestSubstring(String s) {

        Queue<Character> q = new LinkedList<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            while (q.contains(ch)) {
                q.poll();
            }

            q.add(ch);

            max = Math.max(max, q.size());
        }

        return max;
    }
}