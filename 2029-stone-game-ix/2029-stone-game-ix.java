class Solution {
    public boolean stoneGameIX(int[] stones) {
        
        int zero = 0;
        int first = 0;
        int second = 0;

        for (int num : stones) {
            
            if (num % 3 == 0) {
                zero++;
            } else if (num % 3 == 1) {
                first++;
            } else {
                second++;
            }
        }

        if (zero % 2 == 0) {
            return first > 0 && second > 0;
        } else {
            return Math.abs(first - second) > 2;
        }
    }
}