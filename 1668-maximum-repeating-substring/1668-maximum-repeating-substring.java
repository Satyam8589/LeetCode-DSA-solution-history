class Solution {
    public int maxRepeating(String sequence, String word) {

        int maxCount = 0;
        String rep = word;

        while (sequence.contains(rep)) {
            maxCount++;

            rep += word;
        }

        return maxCount;
    }
}