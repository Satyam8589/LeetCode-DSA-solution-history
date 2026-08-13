class Solution {

    static int gcd(int a, int b) {

        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {

        int sumOdd = n * n;
        int sumEven = n * (n + 1);

        return gcd(sumOdd, sumEven);
    }
}