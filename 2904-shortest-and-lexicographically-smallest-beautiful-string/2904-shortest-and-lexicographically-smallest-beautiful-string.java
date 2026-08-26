class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        

        int count = 0;
        int left = 0;

        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                count++;
            }

            if (count == k) {
            
                while (s.charAt(left) == '0') {
                    left++;
                }

                String current = s.substring(left, right + 1);

                if (ans.equals("")) {
                    ans = current;
                } else if (current.length() < ans.length()) {
                    ans = current;
                } else if (current.length() == ans.length()
                        && current.compareTo(ans) < 0) {
                    ans = current;
                }

                left++;

                count--;
            }
        }
        return ans;
    }
}