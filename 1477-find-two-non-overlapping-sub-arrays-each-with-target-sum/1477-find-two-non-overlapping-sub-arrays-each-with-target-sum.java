class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int count = 0;

        int windowSum = 0;
        int j = 0;

        int minLength = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        int[] best = new int[n];
        
        Arrays.fill(best, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {

            windowSum += arr[i];
            count++;

            while (windowSum > target) {
                windowSum -= arr[j];
                j++;
                count--;
            }

            if (windowSum == target) {

                count = i - j + 1;

                if (j > 0 && best[j - 1] != Integer.MAX_VALUE) {
                    answer = Math.min(
                        answer,
                        best[j - 1] + count
                    );
                }

                minLength = Math.min(minLength, count);
            }

            if (i > 0) {
                best[i] = best[i - 1];
            }

            best[i] = Math.min(best[i], minLength);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}