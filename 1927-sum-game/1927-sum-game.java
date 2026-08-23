class Solution {
    public boolean sumGame(String num) {
        
        int n = num.length();

        int leftQ = 0;
        int rightQ = 0;

        int leftSum = 0;
        int rightSum = 0;

        int mid = n / 2;

        for (int i = 0; i < mid; i++) {

            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = mid; i < n; i++) {

            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        int diff = leftSum - rightSum;

        return diff != 9.0 * (rightQ - leftQ) / 2;
    }
}